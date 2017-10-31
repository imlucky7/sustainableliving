package com.test.record;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.exercise.Record.ConsumptionRecord;
import com.exercise.User.Consumer;
import com.exercise.User.IUser;
import com.exercise.core.IEnergy;
import com.exercise.core.Power;
import com.exercise.dao.ConsumptionRecordImpl;
import com.exercise.dao.IConsumptionDao;

public class UserConsumptionTest {
	
	IConsumptionDao consumptionDao;
	IUser consumer;
	IEnergy energy;
	
	@Before
	public void initialize() {
		consumptionDao = new ConsumptionRecordImpl();
		consumer = new Consumer();
		energy = new Power();
	}
	
	@Test
	public void saveConsumptionRecord() throws Exception {
		
		ConsumptionRecord record = new ConsumptionRecord();
		record.setAmount(12);
		record.setConsumer(consumer);
		record.setEnergy(energy);
		
		assertTrue(consumptionDao.saveConsumptionRecord(record));
	}
	
	@Test
	public void unsaveConsumptionRecord() {
		
		ConsumptionRecord record = new ConsumptionRecord();
		record.setAmount(12);
		record.setConsumer(null);
		record.setEnergy(null);
		
		try {
			consumptionDao.saveConsumptionRecord(record);
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals("Exception message", e.getMessage());
		}
	}
	
}
