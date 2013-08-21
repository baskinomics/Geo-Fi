package com.baskinomics.geofi;

public class DataRecord {
	private double lat;
	private double lon;
	private float currentBearing;
	private double currentAltitude;
	private float currentSpeed;
	private float currentAccuracy;
	private String currentProvider;
	private long currentUtcTime;
	private int currentIpAddress;
	private int currentLinkSpeed;
	private String currentMacAddress;
	private String currentSSID;
	private int currentRSSI;

	/**
	* @TODO
	*/
	public DataRecord() {}

	/**
	* @TODO
	*/
	public void setLocationAttributes(double lat, double lon,
					  float currentBearing, double currentAltitude, 
					  float currentSpeed, float currentAccuracy, 
					  String currentProvider, long currentUtcTime) {
		this.lat = lat;
		this.lon = lon;
		this.currentBearing = currentBearing;
		this.currentAltitude = currentAltitude;
		this.currentSpeed = currentSpeed;
		this.currentAccuracy = currentAccuracy;
		this.currentProvider = currentProvider;
		this.currentUtcTime = currentUtcTime;
	}

	/**
	* @TODO
	*/
	public void setWifiAttributes(int currentIpAddress, int currentLinkSpeed,
								  String currentMacAddress, String currentSSID,
								  int currentRSSI) {
		this.currentIpAddress = currentIpAddress;
		this.currentLinkSpeed = currentLinkSpeed;
		this.currentMacAddress = currentMacAddress;
		this.currentSSID = currentSSID;
		this.currentRSSI = currentRSSI;
	}

	/**
	* @TODO
	*/
	public double getLat() {
		return lat;
	}
	
	/**
	* @TODO
	*/
	public double getLon() {
		return lon;
	}
	
	/**
	* @TODO
	*/
	public double getAltitude() {
		return currentAltitude;
	}

	/**
	* @TODO
	*/
	public float getBearing() {
		return currentBearing;
	}
	
	/**
	* @TODO
	*/
	public float getSpeed() {
		return currentSpeed;
	}
	
	/**
	* @TODO
	*/
	public float getAccuracy() {
		return currentAccuracy;
	}
	
	/**
	* @TODO
	*/
	public String getProvider() {
		return currentProvider;
	}
	
	/**
	* @TODO
	*/
	public long getUtcTime() {
		return currentUtcTime;
	}
	
	/**
	* @TODO
	*/
	public int getIpAddress() {
		return currentIpAddress;
	}
	
	/**
	* @TODO
	*/
	public int getLinkSpeed() {
		return currentLinkSpeed;
	}
	
	/**
	* @TODO
	*/
	public String getMacAddress() {
		return currentMacAddress;
	}
	
	/**
	* @TODO
	*/
	public String getSSID() {
		return currentSSID;
	}
	
	/**
	* @TODO
	*/
	public int getRSSI() {
		return currentRSSI;
	}
}