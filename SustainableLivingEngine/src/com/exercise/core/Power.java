package com.exercise.core;

/**
 * The is electricity energy class
 * 
 * @author pranabd
 *
 */
public class Power implements IEnergy {
	String unitName;

	@Override
	public String getUnit() {
		return this.unitName;
	}
}
