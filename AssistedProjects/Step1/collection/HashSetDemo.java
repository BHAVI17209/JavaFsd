package com.bhavitha.collection;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
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

// Note: no order maintained, no duplicates allowed in hash set
