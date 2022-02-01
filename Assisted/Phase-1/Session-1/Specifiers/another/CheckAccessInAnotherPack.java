package com.bhavitha.liveclass.another;

import com.bhavitha.liveclass.session1.specifiers.AccessSpecifier;

public class CheckAccessInAnotherPack {
	public static void main(String[] args) {
		
		AccessSpecifier obj= new AccessSpecifier();
		//obj.display();//not able to call protected method
		//obj.test();// not able to call private method
		obj.hello();//able to call public method
		//obj.world();//not able to call default method
	}

}