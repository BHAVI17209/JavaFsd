package com.bhavitha.synchroniz;

public class Test {
	
public static void main(String[] args) {
		
		Sender sender=new Sender(); // object want to share between multiple threads
		
		User user1=new User("Bhavitha", "Hiiiii........", sender);
		User user2=new User("Anuhya", "Bye...." , sender);
		
		user1.start();
		user2.start();
	}

}
