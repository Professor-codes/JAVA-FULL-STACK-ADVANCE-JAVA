package com.project.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet{
	
	public void init() {
		System.out.println("ResultServlet::init()");
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ResultServlet::service()");
	}
	
	public void destroy() {
		System.out.println("ResultServlet::destroy()");
	}

}
