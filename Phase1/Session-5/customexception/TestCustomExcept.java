package com.bhavitha.customexception;

public class TestCustomExcept {
	void check(int age) throws NotValidAgeException
	{
		if(age<18)
			throw new NotValidAgeException("Age is less than 18");
		else
			System.out.println("Valid");
	}
	
	public static void main(String[] args) throws NotValidAgeException {
		
		TestCustomExcept t=new TestCustomExcept();
		
		t.check(67);
	}

}
