package com.akshit.systemdesign.chapter5.singletonPattern;

// singleton

public class AircraftOne {

    // static makes it a class property and not object property
    private static AircraftOne aircraftInstance;

    private AircraftOne(){};

    public static AircraftOne getInstance(){
        if(aircraftInstance == null){
            aircraftInstance = new AircraftOne();
        }
        return aircraftInstance;
    }
}
