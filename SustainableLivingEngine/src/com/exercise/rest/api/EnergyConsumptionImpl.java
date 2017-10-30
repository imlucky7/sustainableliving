package com.exercise.rest.api;

import javax.ws.rs.core.Response;

import com.exercise.Record.ConsumptionRecord;
import com.exercise.rest.api.vo.ConsumptionVO;

public class EnergyConsumptionImpl implements IEnergyConsumption {

	@Override
	public Response storeRecord(String userId, ConsumptionVO vo) {
		ConsumptionRecord record = new ConsumptionRecord();
		record.setAmount(vo.getAmount());
		record.setFromDate(vo.getFromDate());
		record.setToDate(vo.getToDate());
		
		//TODO set other parameters also
		
		record.storeConsumptionRecord();
		return null;
	}

}
