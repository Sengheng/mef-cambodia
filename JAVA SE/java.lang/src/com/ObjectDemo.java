package com;

class Employee{
	int empId=10;
	String empName="Praveen";
	
	// constructors
	public Employee() {
		System.out.println("--- Employeee Object Created with "+this.hashCode());
	}
	
	@Override
	public String toString() {
		
		return "Employee id: "+empId+" and Name is "+empName; 
	}
}

public class ObjectDemo {
	
	// Hashing algoritham

	public static void main(String[] args) {
		
		// Create employee object
		Employee emp1=new Employee();
		Employee emp2=emp1;
		
	  if(emp1==emp2) {
		  System.out.println("equals");
	  }else {
		  System.out.println("Not equals");
	  }
	  
	  System.out.println("Employee Data is "+emp1);
	  
		
		
		// Get hashCode of employee object
		//System.out.println(emp.hashCode());
		
		
		
	}

}
