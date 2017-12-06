package com;

public interface Manager {

	/* (non-Javadoc)
	 * @see com.Customer#deposit(int)
	 */
	void deposit(int amt);

	/* (non-Javadoc)
	 * @see com.Customer#withDraw(int)
	 */
	void withDraw(int amt);

	void openAccount();

	void closeAccount();

}