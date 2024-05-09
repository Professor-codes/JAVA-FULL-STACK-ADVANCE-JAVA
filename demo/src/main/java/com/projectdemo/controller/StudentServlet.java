package com.projectdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("name");
		String enrollnum = request.getParameter("enrolnum");
		String gender = request.getParameter("gender");
		String[] interest = request.getParameterValues("interest");


		PrintWriter out = response.getWriter();

		out.print("<HTML><BODY>");
		out.print("<br>Id : " + enrollnum);
		out.print("<br>Name : " + name);
		out.print("<br>Gender : " + gender);
		out.print("<br>Interest : " + interest);
		out.print("</BODY></HTML>");

	}

}
