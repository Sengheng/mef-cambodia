package com;

public class Person {
	
	/*
	 * when we need to create object
	 * -------------------------------
	 * --> to access all non static data from static methods
	 * --> to initialize memory for the class data
	 * 
	 * instance data:
	 * ---------------
	 *	-> this data must be invoked by only with objects. 
	 *  -> static methods never allow to access instance data directly. you need objests here tio access them
	 *  
	 *  static data
	 *  --------------
	 *  	-> static data is sharable to all the objects in the class.
	 *  	-> static methods will accept only static data directly.
	 *  	-> If static data belongs to same class, then invocation of static data can be done directly.
	 *         we dont need object to invoke static data from the same class
	 *      -> if you wants to invoke static data of some other class, then you need that class name
	 *         to invoke static data.     
	 */

	 int x; // instance  variable
	 static String name="Ozvitha"; // static variable
	
	
	 void test() { // instance method
		 
		 x=100;
		 name="Abc";
		 
	 }
	public static void main(String[] args) {
		
		
		int i=100;
		
		Person p1=new Person(); // memory occupies --> to all the data in the class
		Person p2=new Person();// memory occupies --> to all the data in the class
		Person p3=new Person();
		
		p1.x=10;
		p2.x=20;
		name="Rudhira";
		
		System.out.println("P1 x: "+p1.x);
		System.out.println("P1 Manager Name: "+name);
		System.out.println("P2 x: "+p2.x);
		System.out.println("P2 Manager Name: "+name);
		
		
		
		
		
		
		
		
	}
}
