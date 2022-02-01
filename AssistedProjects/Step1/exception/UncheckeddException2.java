package com.bhavitha.exception;


// null pointer exception
public class UncheckeddException2 {
	
public static void main(String[] args) {
		
		String name=null;
		
		if(name.equals("admin"))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");
	}

}
