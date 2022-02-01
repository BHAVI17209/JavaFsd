package com.bhavitha.collection;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String> set =new TreeSet<String>();
		
		set.add("ayesha");
		set.add("usha");
		set.add("poojari");
		set.add("krutika");
		//no order maintain
		System.out.println(set);
		//no duplicates allowed
		set.add("krutika");
		
		System.out.println(set);
		
		System.out.println("Is Empty: "+set.isEmpty());
		
		set.remove("krutika");
		
		System.out.println("Size: "+set.size());
		


		
	}

}
