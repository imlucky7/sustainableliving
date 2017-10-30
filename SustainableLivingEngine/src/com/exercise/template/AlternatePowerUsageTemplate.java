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

	String id;
	String templateType;
	
	public AlternatePowerUsageTemplate() {
		templateType = "AlternatePowerUsageTemplate";
		id = "";
	}
	
	@Override
	public String getTemplateType() {
		return this.templateType;
	}
	
	@Override
	public void customiseTemplate() {
		// TODO customize the template
	}

	@Override
	public String getTemplateId() {
		return id;
	}

	//TODO implementing the template for using alternate energy

}
