package com.exercise.template;

/**
 * This is the template class for cut down the usage fo power energy
 * 
 * @author pranabd
 *
 */
public class CutdownPowerUsageTemplate extends PowerTemplate {
	
	String id;
	String templateType;

	public CutdownPowerUsageTemplate() {
		templateType = "CutdownPowerUsageTemplate";
		id = "";
	}

	@Override
	public String getTemplateType() {
		return this.templateType;
	}

	@Override
	public void customiseTemplate() {
		// customize the template
		
	}

	@Override
	public String getTemplateId() {
		return id;
	}
	
	// TODO implementing the template for cut down usage

}
