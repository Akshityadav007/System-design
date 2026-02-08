package com.akshit.systemdesign.chapter8.ParkingLot.interfaces;

public abstract class ParkingSpot {

    private int id;
    private boolean isFree;
    private Vehicle vehicle;
    public abstract boolean isFree();


    // get setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
