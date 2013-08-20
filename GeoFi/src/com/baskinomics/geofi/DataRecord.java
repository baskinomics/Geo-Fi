package com.baskinomics.geofi;

public class DataRecord {
	double lat;
	double lon;
	float currentBearing;
	double currentAltitude;
	float currentSpeed;
	long currentSysTime;
	float currentAccuracy;
	String currentProvider;
	long currentUtcTime;

	public DataRecord(double lat, double lon, float currentBearing,
					  double currentAltitude, float currentSpeed, 
					  long currentSysTime, float currentAccuracy,
					  String currentProvider, long currentUtcTime) {

		this.lat = lat;
		this.lon = lon;
		this.currentBearing = currentBearing;
		this.currentAltitude = currentAltitude;
		this.currentSpeed = currentSpeed;
		this.currentTime = currentTime;
		this.currentAccuracy = currentAccuracy;
		this.currentProvider = currentProvider;
		this.currentUtcTime = currentUtcTime;
	}

		public double getLat() {
		return lat;
	}

	public double getLon() {
		return lon;
	}

	public float getBearing() {
		return currentBearing;
	}

	public double getAltitude() {
		return currentAltitude;
	}

	public float getSpeed() {
		return currentSpeed;
	}

	public long getTime() {
		return currentTime;
	}

	public float getAccuracy() {
		return currentAccuracy;
	}

	public String getCurrentProvider() {
		return currentProvider;
	}

	public long getCurrentUtcTime() {
		return currentUtcTime;
	}
}