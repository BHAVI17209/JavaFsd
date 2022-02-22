package com.bhavitha.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
	//get request is handled by this do get method
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	// post request handles by this method
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		
		String input= req.getParameter("uname");
		//out.print("<h1> Welcome "+input+"<h1>");  it will not take headers like this by default it takes value as plain text
		// so use below statement
		resp.setContentType("text/html");
		out.print("Welcome "+input);
		
	}
}

//if method="post is removed then by default u can use print writer and all respective statements must be written in do get method
//then call the do get method in do post method