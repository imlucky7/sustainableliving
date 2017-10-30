package com.exercise.Record;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.exercise.core.IEnergy;
import com.exercise.core.IUser;

/**
 * ConsumptionRecord class will hold the records
 * of energy usage of consumers for a given time frame
 * along with other usage attributes
 * 
 * @author pranabd
 *
 */
public class ConsumptionRecord {
	
	// Consumer of the energy
	IUser consumer;
	
	// Energy type
	IEnergy energy;
	
	// Starting date and time of consumption
	Date fromDate;
	
	// Ending date and time of consumption
	Date toDate;
	
	// measurement amount
	double amount;
	
	//Other consumption attributes and values
	Map<String, String> attributes = new HashMap<>();

	public IUser getConsumer() {
		return consumer;
	}

	public void setConsumer(IUser consumer) {
		this.consumer = consumer;
	}

	public IEnergy getEnergy() {
		return energy;
	}

	public void setEnergy(IEnergy energy) {
		this.energy = energy;
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

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public String storeConsumptionRecord() {
		
		//TODO DB operation to store the consumption records
		return null;
	}
}
