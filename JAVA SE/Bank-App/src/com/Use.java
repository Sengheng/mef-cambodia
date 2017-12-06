package com;

public class Use {
	
	public static void main(String[] args) {
		
		
		//BankOperations bp=new BankOperations();
		
		Customer cust=new BankOperations();
		cust.withDraw(1000);
		
		Manager m=new BankOperations();
		m.openAccount();
		
		BankOfficer bo=new BankOperations();
		bo.lockerAccess();
		
		
		
		
	}

}
