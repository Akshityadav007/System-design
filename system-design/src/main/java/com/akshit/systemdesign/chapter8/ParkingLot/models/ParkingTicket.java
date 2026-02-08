package com.akshit.systemdesign.chapter8.ParkingLot.models;

import com.akshit.systemdesign.chapter8.ParkingLot.constants.TicketStatus;
import com.akshit.systemdesign.chapter8.ParkingLot.interfaces.Payment;
import com.akshit.systemdesign.chapter8.ParkingLot.interfaces.Vehicle;

import java.util.Date;

public class ParkingTicket {

    private int ticketNo;
    private Date entryAt;
    private Date exitAt;
    private double amount;
    private boolean status;

    private Vehicle vehicle;
    private Payment payment;
    private TicketStatus ticketStatus;

    private Entry entry;
    private Exit exit;

}
