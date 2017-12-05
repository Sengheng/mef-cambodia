package com;

public class ContractEmployee extends Employee {

	int noOfDaysWorked;


	@Override // Annotation
	public void calculateSalary() {
	
		this.setSalary(noOfDaysWorked*763463443);
		
		
	}
	
	

}
