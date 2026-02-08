package com.akshit.systemdesign.chapter8.ParkingLot.interfaces;

import com.akshit.systemdesign.chapter8.ParkingLot.constants.PaymentStatus;

import java.util.Date;

public abstract class Payment {
    private double amount;
    private PaymentStatus paymentStatus;
    private Date createdAt;
    private String transactionId;

    public abstract boolean initiateTransaction();
}
