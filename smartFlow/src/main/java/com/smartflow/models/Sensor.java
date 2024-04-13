package com.smartflow.models;

import com.smartflow.enums.SensorType;

public class Sensor {
	private int locationId;
	private long time;
	private String value;
	private SensorType sensorType;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String string) {
		this.value = string;
	}
	public SensorType getParameter() {
		return sensorType;
	}
	public void setParameter(SensorType parameter) {
		this.sensorType = parameter;
	}
	
}
