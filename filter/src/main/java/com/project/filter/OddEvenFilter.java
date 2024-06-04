package com.project.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/OddEvenServlet")
public class OddEvenFilter implements Filter {

	// init method
	public void init(FilterConfig config) {

	}

	// doFilter method
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		// cast
		// HttpServletRequest req = (HttpServletRequest) request;

		// validation
		String numStr = request.getParameter("num");

		boolean isError = false;

		if (numStr == null || numStr.trim().length() == 0) {
			isError = true;
			request.setAttribute("numError", "Please enter number!");
		}

		RequestDispatcher rd = null;
		if (isError == true) {
			// back to OddEvenInput.jsp
			rd = request.getRequestDispatcher("OddEvenInput.jsp");
			rd.forward(request, response);
		} else {
			// go to OddEvenOutput.jsp
			rd = request.getRequestDispatcher("OddEvenOutput.jsp");
			rd.forward(request, response);
			
			// go to the next filter or requested resources
			chain.doFilter(request, response);
		}
	}

	// destroy method
	public void destroy() {

	}
}
