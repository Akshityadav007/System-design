package com.akshit.systemdesign.chapter8.ParkingLot.models;

import com.akshit.systemdesign.chapter8.ParkingLot.interfaces.ParkingSpot;

public class Compact extends ParkingSpot {

    @Override
    public boolean isFree() {
        // add logic to return free spot
        return false;
    }
}
