package com.exercise.Record;

import java.util.Date;

import com.exercise.core.IEnergy;
import com.exercise.core.IUser;

public class ConsumptionRecord {
	IUser consumer;
	IEnergy energy;
	Date fromDate;
	Date toDate;
	double unit;
}
