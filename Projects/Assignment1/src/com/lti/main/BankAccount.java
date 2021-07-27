package com.lti.main;

public abstract class BankAccount {

	private int accountNo;
	private double balance;
	private String password;
	public String bankName;
	
	public BankAccount() {
	}

	public BankAccount(int accountNo, String bankName, String password, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.password = password;
		this.bankName = bankName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void displayAccount() {
		System.out.println("Bank Name: "+bankName);
		System.out.println("Account Number: "+accountNo);
		System.out.println("Balance: "+balance);
	}
	abstract double withdraw(double amount);
}
