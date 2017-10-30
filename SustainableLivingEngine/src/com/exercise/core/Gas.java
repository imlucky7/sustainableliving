package com.exercise.core;

/**
 * This is gas energy class
 * 
 * @author pranabd
 *
 */
public class Gas implements IEnergy {
	String unitName;
	
	@Override
	public String getUnit() {
		return this.unitName;
	}
}
