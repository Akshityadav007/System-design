package com.akshit.systemdesign.chapter8.ParkingLot.interfaces;

import com.akshit.systemdesign.chapter8.ParkingLot.constants.AccountStatus;
import com.akshit.systemdesign.chapter8.ParkingLot.models.Person;

public abstract class Account {
    private String username;
    private String password;
    private AccountStatus accountStatus;
    private Person person;

    public abstract boolean resetPassword();
}
