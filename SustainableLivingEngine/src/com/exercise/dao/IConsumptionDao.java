package com.exercise.dao;

import com.exercise.Record.ConsumptionRecord;

public interface IConsumptionDao {
	public void saveConsumptionRecord(ConsumptionRecord record) throws Exception;
}
