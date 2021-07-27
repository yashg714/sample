package com.lti.polymorphism;

public class Seller extends Amazon {

	
	public Seller() {
		super();
	}

	@Override
	void purchase(double price) {
		double totalPrice=price-price*amazonDiscount();
		System.out.println("Amount to paid is "+totalPrice);
	}

}
