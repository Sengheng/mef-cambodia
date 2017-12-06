package com.bank.dao;

import com.bank.pojo.Account;

public interface ManagerDao {

	void deposit(int amt);

	void withDraw(int amt);

	void openAccount(Account acc);

	void closeAccount(Account acc);

}