package com.lti.main;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAccountDaoImpl implements AccountDao {

	private static List<BankAccount> bankAccount=new ArrayList<BankAccount>();
	@Override
	public void addAnBankAccount(BankAccount BankAccount) {
		bankAccount.add(BankAccount);
		}

	@Override
	public void withdraw(int BankAccountNumber, double amount) {
		boolean flag=true;
		for(BankAccount ba:bankAccount) {
			if(ba.getAccountNo()==BankAccountNumber)
			{
				if(ba.getBalance()>=amount)
					System.out.println(amount+" withdrawn from account number "+BankAccountNumber);
				else
					System.out.println("Insufficient Balance");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Account number invalid");
	}

	@Override
	public double checkBalance(int BankAccountNumber) {
		boolean flag=true;
		for(BankAccount ba:bankAccount) {
			if(ba.getAccountNo()==BankAccountNumber)
			{
				return ba.getBalance();
			}
		}
		return -999;
	}

	@Override
	public void changePassword(int BankAccountNumber, String oldPassword, String newPassword) {
		
		boolean flag=true;
		for(BankAccount ba:bankAccount) {
			if(ba.getAccountNo()==BankAccountNumber)
			{
				ba.setPassword(newPassword);
				System.out.println("Password Change Successful");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Account number invalid");
	}

	@Override
	public List<BankAccount> viewAllBankAccounts() {
		// TODO Auto-generated method stub
		return bankAccount;
	}

	@Override
	public void getBankAccountDetails(int BankAccountNumber) {
		boolean flag=true;
		for(BankAccount ba:bankAccount) {
			if(ba.getAccountNo()==BankAccountNumber)
			{
				System.out.println(ba.getAccountNo()+" "+ba.getBankName()+" "+
						ba.getBalance());
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Account number invalid");
	}

}
