package com.lti.main;

public class SavingAccount extends BankAccount {

	 private  double minimumBalance;

	public SavingAccount() {
		super();
	}

	public SavingAccount( int accountNo,String bankName, String password,  double balance, double minimumBalance) {
		super(accountNo, bankName, password,balance );
		this.minimumBalance=minimumBalance;
	}

	public  double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance( double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public void displayAccount() {
		super.displayAccount();
		System.out.println("MinimumBalance required is "+this.minimumBalance);
	}

	@Override
	 double withdraw( double amount) {
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
		
		if(amount>super.getBalance())
			return -999;
		else
			return super.getBalance()-amount;
		
	}

}
