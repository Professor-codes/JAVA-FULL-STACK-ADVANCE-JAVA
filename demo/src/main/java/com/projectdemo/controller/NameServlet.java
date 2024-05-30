package com.projectdemo.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");

		boolean isError = false;
		if (name == null || name.trim().length() == 0) {
			isError = true;
			request.setAttribute("nameError", "Please enter your name!");
		}else {
			request.setAttribute("nameValue", name);
		}
		
		if (isError == true) {
			// PREVIOUS JSP
			RequestDispatcher rd = request.getRequestDispatcher("InputName.jsp");
			rd.forward(request, response);
		} else {
			// NEXT JSP
			RequestDispatcher rd = request.getRequestDispatcher("PrintName.jsp");
			rd.forward(request, response);
		}
	}
}
