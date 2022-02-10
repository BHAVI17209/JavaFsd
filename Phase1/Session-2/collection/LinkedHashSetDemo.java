package com.bhavitha.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
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
		
		set.add(null);
		System.out.println(set);

		
	}

}

