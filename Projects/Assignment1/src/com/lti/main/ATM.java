package com.lti.main;

public interface ATM {
	
	void withdraw(int accountNumber,double amount);
	void changePassword(int accountNumber,String oldPassword,String newPassword);
	void checkBalance();

}
