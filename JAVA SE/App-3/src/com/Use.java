package com;

public class Use {

	public static void main(String[] args) {
		
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.setEmpId(10);
		e1.setEmpName("Praveen");
		e1.setSalary(34344);
		
		e2.setEmpId(11);
		e2.setEmpName("Ruth");
		e2.setSalary(343434);
		
		
		e1.display();
		e2.display();
		
		
	}
}
