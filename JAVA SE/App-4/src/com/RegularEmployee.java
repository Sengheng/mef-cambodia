package com;

public class RegularEmployee extends Employee{

	int noOfDaysWorked;
	
	@Override
	public void calculateSalary() {
		this.setSalary(noOfDaysWorked*438738488);
	}
	
}
