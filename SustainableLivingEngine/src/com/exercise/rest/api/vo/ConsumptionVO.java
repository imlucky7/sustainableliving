package com.exercise.rest.api.vo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This VO class stores the common consumption
 * related data for a any energy type.
 * It has 3 sub classes for different types
 * of energy services to store energy specific data
 * 
 * @author pranabd
 *
 */
@XmlRootElement(name = "ConsunptionVO")
public class ConsumptionVO {
	String energyType;
	Date fromDate;
	Date toDate;
	double amount;
	String unit;
	public String getEnergyType() {
		return energyType;
	}
	public void setEnergyType(String energyType) {
		this.energyType = energyType;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
}
