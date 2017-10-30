package com.exercise.core;

/**
 * This is water energy class
 * 
 * @author pranabd
 *
 */
public class Water implements IEnergy {
	String unitName;
	String type;
	
	public Water() {
		this.unitName = "liter";
		this.type = "Water";
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
