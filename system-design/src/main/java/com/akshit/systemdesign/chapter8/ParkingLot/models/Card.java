package com.akshit.systemdesign.chapter8.ParkingLot.models;

import com.akshit.systemdesign.chapter8.ParkingLot.interfaces.Payment;

public class Card extends Payment {
    @Override
    public boolean initiateTransaction() {
        // add implementation here
        return false;
    }
}
