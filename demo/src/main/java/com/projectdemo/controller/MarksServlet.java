package com.projectdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MarksServlet")
public class MarksServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// GET PARAMETERS
		String name = request.getParameter("name");
		String mathsString = request.getParameter("maths");
		String scienceString = request.getParameter("science");
		String englishString = request.getParameter("english");

		// REGEX
		String name_regex = "[a-zA-Z\\s]+";
		String marks_regex = "[0-9]{1,2}";
		 
		// VALIDATIONS
		boolean isError = false;
		
		String error = "";

		if (name == null || name.trim().length() == 0) {
			isError = true;
			error = "<br><br>-- Name must be required!";
		}else if(name.matches(name_regex) == false) {
			isError = true;
			error = "<br><br>-- Enter valid name! {RegEx error}";
		}
		if (mathsString == null || mathsString.trim().length() == 0) {
			isError = true;
			error += "<br><br>-- Maths marks must be required!";
		}else if(mathsString.matches(marks_regex) == false) {
			isError = true;
			error += "<br><br>-- Enter valid maths marks! {RegEx error}";
		}
		if (scienceString == null || scienceString.trim().length() == 0) {
			isError = true;
			error += "<br><br>-- Science marks must be required!";
		}else if(scienceString.matches(marks_regex) == false) {
			isError = true;
			error += "<br><br>-- Enter valid science marks! {RegEx error}";
		}
		if (englishString == null || englishString.trim().length() == 0) {
			isError = true;
			error += "<br><br>-- English marks must be required!";
		}else if(englishString.matches(marks_regex) == false) {
			isError = true;
			error += "<br><br>-- Enter valid english marks! {RegEx error}";
		}

		if (isError == true) {
			// ERROR
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("Correct below errors");
			out.print(error);
			out.print("</html></body>");
			
		} else {
			Integer maths = Integer.parseInt(mathsString);
			Integer science = Integer.parseInt(scienceString);
			Integer english = Integer.parseInt(englishString);
 
			Float percentage = (maths + science + english) / 3.0f;

			// HTML - text/html
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();

			out.print("<html><body>");

			out.print("Name : " + name + "<br><br>");
			out.print("Percentage : " + percentage);

			out.print("</html></body>");
		}
	}
}
