package com.lti.model;

public class DiplomaCourse extends Course {
	Type type;

	public DiplomaCourse() {
		super();
	}

	public DiplomaCourse(int id, int duration, int fee, String name,Type type) {
		super(id, duration, fee, name);
		this.type=type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	public void calculateMontlyFee() {
		super.calculateMontlyFee();
		int fee=super.getFee();
		System.out.println(super.getId()+" "+super.getName()+" "+super.getDuration());
		if(type.name().equals("Professional"))
			System.out.println("Total fee is "+fee*1.1);
		else
			System.out.println("Total fee is "+fee*1.05);
	}
	
}
