package com.project;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

	public void init() throws ServletException {
		System.out.println("ServletLifeCycle::init()");
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ServletLifeCycle::service()");
	}
	
	public void destroy() {
		System.out.println("ServletLifeCycle::destroy()");		
	}
	
}
