package com;

public class Person {

	 int x; // instance  variable
	 static String name="Ozvitha"; // static variable
	
	
	 void test() { // instance method
		 
		 x=100;
		 name="Abc";
		 
	 }
	public static void main(String[] args) {
		
		
		int i=100;
		
		Person p1=new Person();
		Person p2=new Person();
		
		p1.x=10;
		p2.x=20;
		name="Rudhira";
		
		System.out.println("P1 x: "+p1.x);
		System.out.println("P1 Manager Name: "+name);
		System.out.println("P2 x: "+p2.x);
		System.out.println("P2 Manager Name: "+name);
		
		
		
		
		
		
		
		
	}
}
