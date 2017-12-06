package com.bank.service;

import com.bank.dao.BankDaoImpl;
import com.bank.dao.CustomerDao;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao custDao=new BankDaoImpl();

	
	public void depositAmt(int amt) {
		custDao.deposit(amt);
	}
	
	public void withDraw(int amt) {
		custDao.withDraw(amt);
	}

}
