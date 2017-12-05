package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	// setters

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSalary(double salary) {

		this.salary = salary;
	}

	// Getters

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}

	public void display() {
		System.out.println("Employee id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("---------------------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
