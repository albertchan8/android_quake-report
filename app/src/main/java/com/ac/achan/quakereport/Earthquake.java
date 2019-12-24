package com.ac.achan.quakereport;

public class Earthquake {

    // Magnitude of the earthquake
    private double mMagnitude;

    // Location of the earthquake
    private String mLocation;

    // Time of the earthquake
    private Long mTimeInMilliseconds;

    // Url of the earthquake
    private String mUrl;

    // Constructs a new Earthquake object
    public Earthquake(double magnitude, String location, Long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    // Returns the magnitude of the earthquake
    public double getMagnitude() {
        return mMagnitude;
    }

    // Returns the location of the earthquake
    public String getLocation() {
        return mLocation;
    }

    // Returns the time of the earthquake
    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    // Returns the url of the earthquake
    public String getUrl() {
        return mUrl;
    }
}
