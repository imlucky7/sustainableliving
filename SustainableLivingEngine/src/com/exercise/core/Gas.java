package com.exercise.core;

/**
 * This is gas energy class
 * 
 * @author pranabd
 *
 */
public class Gas implements IEnergy {
	String unitName;
	String type;
	
	public Gas() {
		this.unitName = "gram";
		this.type = "Gas";
	}
	@Override
	public String getUnit() {
		return this.unitName;
	}

	@Override
	public String getType() {
		return this.type;
	}
}
