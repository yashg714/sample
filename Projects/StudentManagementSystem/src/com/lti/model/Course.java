package com.lti.model;

public class Course {
	private int id,duration,fee;
	private String name;
	
	protected Course() {
	}

	public Course(int id, int duration, int fee, String name) {
		super();
		this.id = id;
		this.duration = duration;
		this.fee = fee;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected int getDuration() {
		return duration;
	}

	protected void setDuration(int duration) {
		this.duration = duration;
	}

	protected int getFee() {
		return fee;
	}

	protected void setFee(int fee) {
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	public void calculateMontlyFee() {
		System.out.println("Montly Fee is "+fee/duration);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + fee;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (duration != other.duration)
			return false;
		if (fee != other.fee)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
