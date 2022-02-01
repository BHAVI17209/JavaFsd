package com.bhavitha.liveclass.session1.specifiers;

public class AccessSpecifier {
	protected void display() {
			
			System.out.println("you are accessing protected method of this class");
		}
		
		private void test() {
			System.out.println("My private method");
		}
		
		public void hello() {
			System.out.println("Public method");
		}
		
		void world() {
			System.out.println("Default method");
			
		}
		
		// access all methods in same class
		public static void main(String[] args) {
			
			AccessSpecifier obj= new AccessSpecifier();
			obj.display();//able to call protected method
			obj.test();// able to call private method
			obj.hello();//able to call public method
			obj.world();//able to call default method
		}
}

