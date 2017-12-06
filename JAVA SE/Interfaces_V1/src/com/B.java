package com;

public class B implements A,Payroll,Dept {
	@Override
	public void f1() {
		System.out.println("--- f1 method of B class");
	}

	@Override
	public void paySalary() {
		System.out.println("-- Salary got paid to employee");	
	}

	@Override
	public void addDepartment() {
		System.out.println("-- HR departent added");
		
	}

}
