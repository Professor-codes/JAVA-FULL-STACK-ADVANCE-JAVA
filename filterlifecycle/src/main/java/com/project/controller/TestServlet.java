package com.project.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	public void init() {
		System.out.println("TestServlet::init()");
	}

	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("TestServlet::service()");
	}

	public void destroy() {
		System.out.println("TestServlet::destroy()");	
	}

}
