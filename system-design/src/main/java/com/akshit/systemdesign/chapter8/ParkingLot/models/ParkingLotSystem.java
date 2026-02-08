package com.akshit.systemdesign.chapter8.ParkingLot.models;

import com.akshit.systemdesign.chapter8.ParkingLot.interfaces.ParkingSpot;
import com.akshit.systemdesign.chapter8.ParkingLot.interfaces.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotSystem {
    // Singleton design pattern - for ParkingLotSystem class (this)

    private int id;
    private String name;
    private String address;
    private final int capacity = 40000;

    private HashMap<String, Entry> addEntry;
    private HashMap<String, Exit> addExit;
    private ParkingRate parkingRate;
    private Map<String, DisplayBoard> displayBoards;
    private Map<String, ParkingTicket> parkingTickets;
    private Map<String, ParkingSpot> parkingSpots;


    // singleton design pattern - constructor is private (need to handle multithreading race condition issue)

    // instance
    private static ParkingLotSystem parkingLot = null;
    private ParkingLotSystem(){}

    public static ParkingLotSystem getInstance(){
        // TODO: will this work in multi-threaded environment
        if(parkingLot == null)
            parkingLot = new ParkingLotSystem();
        return parkingLot;
    }

    // implement customer interactions handling

    public ParkingTicket getTicket(Vehicle vehicle){
        // add logic
        return null;
    }
    public boolean isFull(){
        // add logic
        return false;
    }
    public boolean addEntrance(Entry entry){
        // add logic
        return false;
    }
    public boolean addExit(Exit exit){
        // add logic
        return false;
    }

    // add more methods as per your needs
}
