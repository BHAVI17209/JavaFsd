package com.bhavitha.liveclass.session1.specifiers;

public class CheckAccessInSamePackage {
	public static void main(String[] args) {
		
		AccessSpecifier obj= new AccessSpecifier();
		obj.display();//able to call protected method
		//obj.test();// able to call private method
		obj.hello();//able to call public method
		obj.world();//able to call default method
}
}