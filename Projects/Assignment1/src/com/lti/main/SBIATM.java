package com.lti.main;

public class SBIATM implements ATM {

	@Override
	public void withdraw(int accountNumber, double amount) {
		System.out.println(amount+" withdraw from account Number: "+accountNumber);
	}

	@Override
	public void changePassword(int accountNumber, String oldPassword, String newPassword) {
		System.out.println(accountNumber+" password changed");

	}

	@Override
	public void checkBalance() {

	}

}
