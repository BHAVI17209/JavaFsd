package com.bhavitha.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Pretham");
		list.add("nikhila");
		list.add("akshaya");
		list.add("ashwin");
		list.add("Chiru");
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		System.out.println(list.contains("niyati"));
		
		System.out.println("element from index 3: "+list.get(3));
		
		System.out.println("Size: "+list.size());
		
		list.add("test");
		System.out.println("Size: "+list.size());
		
		//print elements using for each loop
		for(String s:list)
		{
			System.out.println(s);
		}
		
	}

}
