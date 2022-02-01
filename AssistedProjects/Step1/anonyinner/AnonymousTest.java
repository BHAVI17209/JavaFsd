package com.bhavitha.anonyinner;

public class AnonymousTest {
	
public static void main(String[] args) {
		
		Car cr=new Car() {
			
			@Override
			public void stop() {
				System.out.println("car started from anonymous class");
				
			}
			
			@Override
			public void start() {
				System.out.println("Car stopped from anonymous class");
				
			}
		};
		
		cr.start();
		cr.stop();
	}
}
