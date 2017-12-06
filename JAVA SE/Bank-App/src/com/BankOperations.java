package com;

public class BankOperations implements Customer, Manager, BankOfficer{
	
	
	@Override
	public void deposit(int amt) {
		System.out.println(amt+" Deposited");
	}
	
	@Override
	public void withDraw(int amt) {
		System.out.println(amt+" Withdrawn");
	}
	
	
	@Override
	public void openAccount() {
		System.out.println("-- Account Opened");
	}
	
	@Override
	public void closeAccount() {
		System.out.println("-- Account Closed");
	}
	
	public void lockerAccess() {
		System.out.println("-- Locker Access is given");
	}
	
	
	public void cashDispatcher() {
		System.out.println("-- Cach is dispatched");
	}
	

}
