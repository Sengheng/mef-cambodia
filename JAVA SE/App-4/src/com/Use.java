package com;

public class Use {
	
	public static void main(String[] args) {
		
		ContractEmployee ce=new ContractEmployee();
		RegularEmployee re=new RegularEmployee();
		
		ce.setSalary(438738463);
		
		/*ce.empId=10;
		ce.empName="Praveen";
		ce.salary=10000000;*/
	/*	
		ce.noOfDaysWorked=5;
		re.empId=11;
		re.empName="James";*/
		
		
		ce.setEmpId(10);
		ce.setEmpName("Bucky Wall");
		re.setEmpId(11);
		re.setEmpName("Richards");
		re.noOfDaysWorked=31;
		
		ce.calculateSalary();
		re.calculateSalary();
		
		ce.display();
		re.display();
		
		
	}

}
