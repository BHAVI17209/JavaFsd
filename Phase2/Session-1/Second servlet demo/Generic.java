package com.bhavitha.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generic extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = res.getWriter();
		
		String uname=req.getParameter("uname");
		String password=req.getParameter("pwd");
		
		if(password.equals("Bhavitha17")) {
			
			out.print("Successfully logged in");
			out.print("Welcome"+ uname);
		}else {
			out.print("invalid password!..");
		}
		
		
		
	}
	

}
