package com.exercise.template;

/**
 * This is the template class
 * for using alternate energy
 * instead of power energy
 * 
 * @author pranabd
 *
 */
public class AlternatePowerUsageTemplate extends PowerTemplate {

	String templateType;
	
	public AlternatePowerUsageTemplate() {
		templateType = "AlternatePowerUsageTemplate";
	}
	
	@Override
	public String getTemplateType() {
		return this.templateType;
	}
	
	@Override
	public void customiseTemplate() {
		// TODO customize the template
		
	}

	//TODO implementing the template for using alternate energy

}
