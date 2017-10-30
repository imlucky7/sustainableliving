package com.exercise.template;

import com.exercise.core.Gas;
import com.exercise.core.IEnergy;

/**
 * This abstract class creates the
 * template for Gas energy.
 * 
 * @author pranabd
 *
 */
public abstract class GasTemplate implements ITemplate {

	IEnergy energy;
	
	public GasTemplate() {
		energy = new Gas();
	}
	
	@Override
	public String getTemplateType() {
		return energy.getType();
	}
}
