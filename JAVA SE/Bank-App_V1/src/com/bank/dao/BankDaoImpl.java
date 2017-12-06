package com.bank.dao;

import com.bank.pojo.Account;

public class BankDaoImpl implements CustomerDao, ManagerDao, BankOfficerDao {
	
	public void deposit(int amt) {
		System.out.println(amt+" Deposited");
	}
	
	
	public void withDraw(int amt) {
		System.out.println(amt+" Withdrawn");
	}
	
	
	
	public void openAccount(Account acc) {
		System.out.println("-- Account Opened");
	}
	
	
	public void closeAccount(Account acc) {
		System.out.println("-- Account Closed");
	}
	
	public void lockerAccess() {
		System.out.println("-- Locker Access is given");
	}
	
	
	public void cashDispatcher() {
		System.out.println("-- Cach is dispatched");
	}

}
