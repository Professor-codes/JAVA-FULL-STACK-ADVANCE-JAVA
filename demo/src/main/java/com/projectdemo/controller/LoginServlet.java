package com.projectdemo.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) {
		 System.out.println("Login.");
		 
		 // GET DATA
		 String username = request.getParameter("username");
		 System.out.println(username);
		 
		 String password = request.getParameter("password");
		 System.out.println(password);
		 
	}
}
