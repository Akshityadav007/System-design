package com.akshit.systemdesign.chapter8.ParkingLot.models;

import com.akshit.systemdesign.chapter8.ParkingLot.interfaces.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {
    private int id;
    private Map<String, List<ParkingSpot>> parkingSpot;


    public DisplayBoard(int id) {
        this.id = id;
        parkingSpot = new HashMap<>();
    }

    public void showFreeSlot(){}
    public void sendParkingFullNotification(){}
    public void addParkingSlot(String spotType, List<ParkingSpot> spots){
        // add logic here
    }
}
