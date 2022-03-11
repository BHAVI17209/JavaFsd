package com.bhavitha.oopspillars.diamondproblem;

public class TestAggregation {
	
	public static void main(String[] args) {
		
		Address address1=new Address("Mumbai", "Maharasthra", 307282);
		
		Student st1=new Student(1, "bhavitha", "xyzabc.com", address1);
		
		st1.display();
	}
	
	

}
