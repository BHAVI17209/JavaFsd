package com.bhavitha.first.phase1pracice;

import java.util.Scanner;

public class CalculatorProject {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 int num1,num2;
		 double result;
		 String operator;
		 
		 System.out.println("Enter First number:");
		 num1= sc.nextInt();
		 
		 System.out.println("Enter second number:");
		 num2=sc.nextInt();
		 
		 System.out.println("Select an operator (+, -, *, /): ");
		 operator=sc.next();
		 
		 switch (operator) {
		case "+":
			result= num1+num2;
			System.out.println(num1+" + "+num2+" = "+result);
			break;
		case "-":
			result= num1-num2;
			System.out.println(num1+" - "+num2+" = "+result);
			break;
		case "*":
			result= num1*num2;
			System.out.println(num1+" * "+num2+" = "+result);
			break;
		case "/":
			result= num1/num2;
			System.out.println(num1+" / "+num2+" = "+result);
			break;
		default:
			System.out.println("Enter valid operator..");
			break;
			
		}
		 
	}
}


