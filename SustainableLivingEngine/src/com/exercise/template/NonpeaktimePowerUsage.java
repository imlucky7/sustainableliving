package com.exercise.template;

/**
 * This is the template class for
 * using more power at non-peak time
 * 
 * @author pranabd
 *
 */
public class NonpeaktimePowerUsage extends PowerTemplate {

	String templateType;

	public NonpeaktimePowerUsage() {
		templateType = "NonpeaktimePowerUsage";
	}

	@Override
	public String getTemplateType() {
		return this.templateType;
	}

	@Override
	public void customiseTemplate() {
		// TODO customize the template
		
	}

	//TODO implementation of non-peak time power usage
	
}
