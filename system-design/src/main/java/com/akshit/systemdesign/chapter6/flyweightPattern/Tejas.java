package com.akshit.systemdesign.chapter6.flyweightPattern;

public class Tejas implements IAircraft{

    // intrinsic property
    private final String name = "Tejas";
    private final int seater = 2;
    private final String dimensions = "15m long 4m wide";
    private final String wingspan = "40 feet";

    // extrinsic property
    public double getTotalTimeToReachDestination(int srcX, int srcY, int desX, int desY, int speed){
        return 5;   // we can calculate and return it from here
    }
}
