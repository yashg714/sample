package com.lti.polymorphism;

public class ICICATM implements ATM {

	private double balance=10000;
	@Override
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("Amount withdraw from ICIC ATM is "+amount);

	}

	@Override
	public double checkBalance() {
		System.out.println("Amount balance is "+balance);
		return balance;
	}

}
