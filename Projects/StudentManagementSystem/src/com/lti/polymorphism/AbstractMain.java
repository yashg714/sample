package com.lti.polymorphism;

import java.util.Scanner;

public class AbstractMain {

	public static void main(String[] args) {
		Amazon amazon=null;
		System.out.println("Enter your choice\n 1.Seller1 2.Seller2");
		
		int ch=new Scanner(System.in).nextInt();
		if(ch==1)
			amazon=new Seller();
		else
			amazon=new Seller2();
		
		amazon.purchase(5000);
		

	}

}
