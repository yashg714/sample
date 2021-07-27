package com.lti.main;

public class CurrentAccount extends BankAccount {

	private double overDraftLimitAmount;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int accountNo,String bankName, String password, double balance,double overDraftLimitAmount) {
		super(accountNo, bankName, password,balance );
		this.overDraftLimitAmount=overDraftLimitAmount;
	}

	public double getoverDraftLimitAmount() {
		return overDraftLimitAmount;
	}

	public void setoverDraftLimitAmount(double overDraftLimitAmount) {
		this.overDraftLimitAmount = overDraftLimitAmount;
	}
	
	public void displayAccount() {
		super.displayAccount();
		System.out.println("overDraftLimitAmount is "+overDraftLimitAmount);
	}

	@Override
	double withdraw(double amount) {
		try {
			if(amount<0)
				throw new InvalidAmountException("Enter a Valid amount");
			if(amount>super.getBalance())
				throw new InsufficientFundException("Insufficient Balance");
		} catch (InvalidAmountException e) {
			System.out.println(e.toString());
		}
		catch(InsufficientFundException e){
			System.out.println(e.toString());
		}
		
		if(amount>overDraftLimitAmount)
			return -999;
		else
			return overDraftLimitAmount-amount;
	}

}
