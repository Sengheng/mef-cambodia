package com;

import java.io.PrintStream;

public class Use {
	
	
	void f1() {
		System.out.println("-- Use class f1 method");
	}
	
	static void test() {
		System.out.println("-- Test method of Use class");
	}

	public static void main(String[] args) {
		
		test(); // call/ invoke directly
		
		Teacher.teacherName="Praveen"; // need call name of invocation class
		Teacher.doTeach();
		
		Teacher t=new Teacher();
		t.fun();
		
	/*	
		  PrintStream ps= System.out;
		  ps.println("Hello ");*/
		  
		System.out.println("skdhdkf");
		
		
		new Use().f1();
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
