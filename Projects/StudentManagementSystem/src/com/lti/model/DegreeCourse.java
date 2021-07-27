package com.lti.model;

public class DegreeCourse extends Course {
	DegreeLevel degreeLevel;
	boolean isPlacementAvailable;
	public DegreeCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DegreeCourse(int id, int duration, int fee, String name,DegreeLevel degreeLevel,boolean isPlacementAvailable) {
		super(id, duration, fee, name);
			this.degreeLevel=degreeLevel;
			this.isPlacementAvailable=isPlacementAvailable;
	}
	public DegreeLevel getDegreeLevel() {
		return degreeLevel;
	}
	public void setDegreeLevel(DegreeLevel degreeLevel) {
		this.degreeLevel = degreeLevel;
	}
	public boolean isPlacementAvailable() {
		return isPlacementAvailable;
	}
	public void setPlacementAvailable(boolean isPlacementAvailable) {
		this.isPlacementAvailable = isPlacementAvailable;
	}
	public void calculateMontlyFee() {
		super.calculateMontlyFee();
		int fee=super.getFee();
		System.out.println(super.getId()+" "+super.getName()+" "+super.getDuration());
		if(isPlacementAvailable)
			System.out.println("Total fee is "+(fee+=fee*0.1));
		else
			System.out.println("Total fee is "+fee);
	}
	

	
}
