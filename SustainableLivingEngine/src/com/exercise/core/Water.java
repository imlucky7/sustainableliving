package com.exercise.core;

/**
 * This is water energy class
 * 
 * @author pranabd
 *
 */
public class Water implements IEnergy {
	String unitName;
	
	@Override
	public String getUnit() {
		return this.unitName;
	}
}
