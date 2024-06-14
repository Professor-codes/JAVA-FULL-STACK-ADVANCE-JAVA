package com.project.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = { "/TestServlet", "/ResultServlet" })
public class TestFilter implements Filter {

	// init method
	public void init(FilterConfig config) {
		System.out.println("TestFilter::init()");
	}

	// doFilter method
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {

	}

	// destroy method
	public void destroy() {
		System.out.println("TestFilter::destroy()");
	}

}
