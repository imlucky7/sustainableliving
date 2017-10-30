package com.exercise.template;

import com.exercise.core.IEnergy;
import com.exercise.core.Water;

/**
 * This abstract class creates the
 * template for water energy.
 * 
 * @author pranabd
 *
 */
public abstract class WaterTemplate implements ITemplate {
	
	IEnergy energy;
	
	public WaterTemplate() {
		energy = new Water();
	}
	
	@Override
	public String getTemplateType() {
		return energy.getType();
	}
}
