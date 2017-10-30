package com.exercise.template;

import com.exercise.core.IEnergy;
import com.exercise.core.Power;

/**
 * This abstract class creates the
 * template for Power energy.
 * 
 * @author pranabd
 *
 */
public abstract class PowerTemplate implements ITemplate {

	IEnergy energy;
	
	public PowerTemplate() {
		energy = new Power();
	}
	
	@Override
	public String getEnergyType() {
		return energy.getType();
	}
}
