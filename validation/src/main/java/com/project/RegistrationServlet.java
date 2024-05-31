package com.project;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");

		boolean isError = false;

		// NAME
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please enter first name!");
		} else {
			request.setAttribute("firstNameValue", firstName);
		}

		// GENDER
		if (gender == null) {
			isError = true;
			request.setAttribute("genderError", "Please select gender!");
		} else {
			request.setAttribute("genderValue", gender);
		}

		// CITY
		if (city.equals("-1")) {
			isError = true;
			request.setAttribute("cityError", "Please select city!");
		} else {
			request.setAttribute("cityValue", city);
		}

		// ERROR
		RequestDispatcher rd = null;
		if (isError == true) {
			// back to Registration.jsp
			rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response);
		} else {
			// send to Home.jsp
			rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
		}
	}
}
