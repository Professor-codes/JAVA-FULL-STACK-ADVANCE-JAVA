package com.projectdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String productName = request.getParameter("productName");
		String productCategory = request.getParameter("productCategory");
		String tempPrice = request.getParameter("productPrice");
		Integer productPrice = Integer.parseInt(tempPrice);
		
		double gstPrice = productPrice * 0.18;
		double finalPrice = productPrice + productPrice * 0.18;
		
		PrintWriter out = response.getWriter();
		
		out.print("<HTML><BODY>");
		
		out.print("<br>Product Name : " + productName);
		out.print("<br>Product Category : " + productCategory);
		out.print("<br>Product Price : " + productPrice);
		out.print("<br>GST Price : " + gstPrice);
		out.print("<br>Final Price : " + finalPrice);
		
		out.print("</BODY></HTML>");
		
	}

}
