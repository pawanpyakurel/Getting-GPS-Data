package com.java.gps;

public class GpsModel {
	private String Vehicle_no;
	private double lat;
	private double lon;
	private String time;
	private float speed;
	
	public String getVehicle_no() {
		return Vehicle_no;
	}
	public void setVehicle_no(String vehicle_no) {
		Vehicle_no = vehicle_no;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	
}
