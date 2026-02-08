package com.akshit.systemdesign.chapter8.ParkingLot.interfaces;

public abstract class Vehicle {
    private int licenseNo;

    public abstract void getTicket();

    public int getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(int licenseNo) {
        this.licenseNo = licenseNo;
    }
}
