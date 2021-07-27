package com.lti.polymorphism;

public class SBIAtm implements ATM {

	private double balance=10000;
	@Override
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("Amount withdraw from SBI ATM is "+amount);

	}

	@Override
	public double checkBalance() {
		System.out.println("Amount balance is "+balance);
		return balance;
	}

}
