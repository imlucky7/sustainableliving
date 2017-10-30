package com.exercise.core;

/**
 * The is electricity energy class
 * 
 * @author pranabd
 *
 */
public class Power implements IEnergy {
	String unitName;
	String type;
	
	public Power() {
		this.unitName = "kWH";
		this.type = "electricity";
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
