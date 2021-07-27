package com.lti.main;

import java.util.List;

public interface AccountDao {
	void addAnBankAccount(BankAccount BankAccount);
	void withdraw(int BankAccountNumber,double amount);
	double	checkBalance(int BankAccountNumber);
	void changePassword(int BankAccountNumber,String oldPassword,String newPassword);
	List<BankAccount> viewAllBankAccounts();
	void getBankAccountDetails(int BankAccountNumber);
}
