package com.bhavitha.first.ifconditional;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num= scanner.nextInt();
		
		if(num%2==0)
			System.out.println(num+ " is an even number");
		else
			System.out.println(num+" is an odd number");
	}

}
