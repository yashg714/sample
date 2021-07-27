package com.lti.polymorphism;

public class Seller2 extends Amazon {

	
	public Seller2() {
		super();
	}

	@Override
	void purchase(double price) {
		double totalPrice=price-price*seller2Discount();
		System.out.println("Amount to paid is "+totalPrice);
	}
	private double seller2Discount()
	{
		return 0.02;
	}
}
