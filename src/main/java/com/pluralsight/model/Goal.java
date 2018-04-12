package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

public class Goal {
	
	@Range(min=1,max=120)
	private int minutes;

	public Goal() {
	
	}

	public Goal(int minutes) {
		this.minutes = minutes;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}

//,message="Goal minutes must be in range of ${min},${max}."