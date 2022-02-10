package com.bhavitha.first.ifconditional;

import java.util.Scanner;

public class DisplayGrade {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the percentage of the student:");
		int percent= sc.nextInt();
		
		if(percent<0 || percent>100)
			System.out.println("Please enter correct result..");
		else if(percent>=70 && percent<=100)
			System.out.println("Distinction..");
		else if(percent>=60 && percent<=69)
			System.out.println("First Class..");
		else if(percent>=50 && percent<=59)
			System.out.println("Second Class..");
		else if(percent>=35 &&percent<= 49)
			System.out.println("Pass..");
		else
			System.out.println("Fail.. better luck next time..:)");
			
		
	}

}
