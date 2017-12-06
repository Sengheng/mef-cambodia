package com.bank.service;

import com.bank.dao.BankDaoImpl;
import com.bank.dao.ManagerDao;
import com.bank.pojo.Account;

public class ManagerServiceImpl implements ManagerService {
	
	private ManagerDao managerDao=new BankDaoImpl();
	
	public void depositAmt(int amt) {
		managerDao.deposit(amt);
	}
	
	public void withDraw(int amt) {
		managerDao.withDraw(amt);
	}
	
	public void openAccount(Account acc) {
		managerDao.openAccount(acc);
	}
	
	
	public void closeAccount(Account acc) {
		managerDao.closeAccount(acc);
	}
	
	

}
