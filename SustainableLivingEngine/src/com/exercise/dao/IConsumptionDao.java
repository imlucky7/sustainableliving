package com.exercise.dao;

import com.exercise.Record.ConsumptionRecord;

public interface IConsumptionDao {
	public boolean saveConsumptionRecord(ConsumptionRecord record) throws Exception;
}
