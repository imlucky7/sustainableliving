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
	String id;

	public NonpeaktimePowerUsage() {
		templateType = "NonpeaktimePowerUsage";
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
		return this.id;
	}

	//TODO implementation of non-peak time power usage
	
}
