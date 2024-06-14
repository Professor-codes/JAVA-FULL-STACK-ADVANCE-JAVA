package com.project.controller;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

	public void init() {

	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (password.equals("1234")) {
			
			// cookie object
			Cookie cookie = new Cookie("username", username);
			response.addCookie(cookie);
			
			response.sendRedirect("CookieHome.jsp");
			
		} else {
			response.sendRedirect("CookieLogin.jsp");
		}
	}

	public void destroy() {

	}

}
