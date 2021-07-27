package com.lti.main;

import java.util.Scanner;

public class ElectricBillGenator {
	int unit;
	double amount;

	public ElectricBillGenator() {
		unit = 0;
		amount = 0;
	}

	public ElectricBillGenator(int unit, double amount) {
		this.unit = unit;
		this.amount = amount;
	}

	private double generateBill(int unit) {
		if (unit < 100) {
			amount = unit * 1.2;
		} else if (unit <= 300) {
			amount = 100 * 1.2;
			unit -= 100;
			amount = amount + (unit * 2);
		} else {
			amount = 100 * 1.2;
			amount = amount + (200 * 2);
			unit -= 300;
			amount = amount + (unit * 3);
		}
		return amount;
	}

	public static void main(String[] args) {
		ElectricBillGenator ob = new ElectricBillGenator();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter the unit:");
			int unit = sc.nextInt();
			System.out.println("You Electricity bill is " + ob.generateBill(unit));
			System.out.println("Press 0 to stop");
			int var = sc.nextInt();
			if (var == 0)
				break;
		} while (true);
	}

}
