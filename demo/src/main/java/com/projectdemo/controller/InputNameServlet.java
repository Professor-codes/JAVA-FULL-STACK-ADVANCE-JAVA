package com.projectdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nameservlet")
public class InputNameServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		name = name.toUpperCase();

		System.out.println("Name to upper case : " + name);
		System.out.println("Name to upper case : " + name);

		// PRINT TO BROWSER

		PrintWriter display = response.getWriter();
		display.println(name);

		// try {
		// PrintWriter out = response.getWriter();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

	}
}
