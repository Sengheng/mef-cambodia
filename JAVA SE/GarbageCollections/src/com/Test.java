package com;

class Employee{
	int empId;
	String empName;	
	static int count=1;
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("--- Object is garbage collected "+(count++));
	}
}

public class Test {

	public static void main(String[] args) {
	
	
		Employee emp=new Employee();
		emp=null;
		System.gc();
	
		
		Runtime rt= Runtime.getRuntime();
		
		System.out.println("Total Memory: "+rt.totalMemory());
		System.out.println("Free Memoery is "+rt.freeMemory());
		
		
		
		System.out.println("--- Done ---");
		
		
		
		

	}

}
