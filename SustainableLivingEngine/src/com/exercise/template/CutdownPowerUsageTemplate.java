package com.exercise.template;

/**
 * This is the template class for cut down the usage fo power energy
 * 
 * @author pranabd
 *
 */
public class CutdownPowerUsageTemplate extends PowerTemplate {

	String templateType;

	public CutdownPowerUsageTemplate() {
		templateType = "CutdownPowerUsageTemplate";
	}

	@Override
	public String getTemplateType() {
		return this.templateType;
	}

	@Override
	public void customiseTemplate() {
		// customize the template
		
	}
	
	// TODO implementing the template for cut down usage

}
