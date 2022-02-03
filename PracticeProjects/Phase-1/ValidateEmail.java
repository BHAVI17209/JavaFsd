package com.bhavitha.first.phase1pracice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidateEmail {
	
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		
		list.add("Virat@mail.com");
		list.add("Anu@mail.com");
		list.add("Mahi@mail.com");
		list.add("prince@mail.com");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your mail id:\n");
		String email= sc.nextLine();
		
		
		if(list.contains(email)) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).equals(email)) {
					System.out.println("Authenticated..\n\n"+"Hi! "+list.get(i)+"\n\nWelcome..:)");
				}
			}
		}
		else 
			System.out.println("Invalid Email id..");
		
	}

}
