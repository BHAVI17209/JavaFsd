package com.bhavitha.first.ifconditional;

import java.util.Scanner;

public class AgeForVote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of the person: ");
		
		int age= sc.nextInt();
		
		if(age>=18)
			System.out.println("Allow the person to vote");
		else
			System.out.println("Person below 18 years, can't allowed to vote");
	}

}
