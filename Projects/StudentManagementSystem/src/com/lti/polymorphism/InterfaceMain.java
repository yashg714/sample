package com.lti.polymorphism;

import java.util.Scanner;

public class InterfaceMain {

	public static void main(String[] args) {
		System.out.println("1.ICIC bank 2.SBI bank \n Select your bank");
		int ch=new Scanner(System.in).nextInt();
		ATM atm=null;
		if(ch==1)
			atm=new ICICATM();
		else
			atm=new SBIAtm();
		atm.withdraw(5000);
		atm.checkBalance();
	}

}
