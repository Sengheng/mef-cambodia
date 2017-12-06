package com.bank.service;

import com.bank.pojo.Account;

public interface ManagerService {

	void depositAmt(int amt);

	void withDraw(int amt);

	void openAccount(Account acc);

	void closeAccount(Account acc);

}