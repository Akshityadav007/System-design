package com.akshit.systemdesign.chapter8.ParkingLot.models;

import com.akshit.systemdesign.chapter8.ParkingLot.interfaces.Account;
import com.akshit.systemdesign.chapter8.ParkingLot.interfaces.ParkingSpot;

public class Admin extends Account {

    @Override
    public boolean resetPassword() {
        // implement logic to reset password
        return false;
    }

    public boolean addParkingSpot(ParkingSpot parkingSpot){
        // implement logic
        return false;
    }

    public boolean addEntrance(Entry entry){
        // implement logic
        return false;
    }

    public boolean addExit(Exit exit){
        // implement logic
        return false;
    }

    public boolean addDisplayBoard(DisplayBoard board){
        // implement logic
        return false;
    }
}
