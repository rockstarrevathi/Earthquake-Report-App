package com.example.android.quakereport;

/**
 * Created by janna on 9/14/2017.
 */

public class Earthquake {

    /* Magnitude of the Earthquake */
    private String mMagnitude;

    /* Location of the Earthquake */
    private String mLocation;

    /* Date of the Earthquake */
    private String mDate;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /*Returns the magnitude of earthquake */
    public String getMagnitude(){
        return mMagnitude;
    }

    /*Returns the location of earthquake */
    public String getLocation(){
        return mLocation;
    }

    /*Returns the date of earthquake */
    public String getDate(){
        return mDate;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}

