package com.bhavitha.first.loops;

public class FirstFiftyOdd {
	
	public static void main(String[] args) {
		
		// printing first fifty odd numbers using for and if loop
		int count=0;
		
		for(int i=1;i<=100;i++) {
			
			if(i%2 !=0) 
				System.out.println(i);
			
			count=count+1;
			if(count>50)
				break;
			
		}	
			
	System.out.println("Total number of odd numbers:"+ count);
		
	}

}
