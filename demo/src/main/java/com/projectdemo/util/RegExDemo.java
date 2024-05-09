package com.projectdemo.util;

public class RegExDemo {

	public static void main(String[] args) {

		// REGEX DEMO
		String simple_regex = "[a-zA-Z]{1,10}";
		String str = "advJava";
		System.out.println("Simple regex : " + str.matches(simple_regex));

		// USERNAME REGEX
		String username_regex = "[a-zA-Z0-9\\s]+";
		String username = "user NAME01";
		System.out.println("Username regex : " + username.matches(username_regex));
		
		// EMAIL REGEX
		String email_regex = "[a-z0-9]+@[a-z]{5,7}+\\.[a-z]{2,3}";
		String email = "user@gmail.com";
		System.out.println("Email regex : " + email.matches(email_regex));
		
		
	}
}
