package com.projectdemo.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signupservlet")
public class SignupServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Singup.");
		
		// GET DATA
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");
		
		System.out.println(username);
		System.out.println(email);
		System.out.println(password);
		System.out.println(confirmpassword);
		
	}
}
