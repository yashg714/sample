package com.lti.main;

public class BankMain {

	public static void main(String[] args) {
		BankAccount saving=new SavingAccount(1001,"HDFC","abc@123",10000,1500);
		BankAccount current=new CurrentAccount(5001,"SBI","abc@123",800000,1000);
		saving.displayAccount();
		current.displayAccount();
		System.out.println("After withdrawing 1000 remaining balance is "+saving.withdraw(1000));
		System.out.println("After withdrawing 1000 remaining overDraft balance is "+current.withdraw(-1000));
	}

}
