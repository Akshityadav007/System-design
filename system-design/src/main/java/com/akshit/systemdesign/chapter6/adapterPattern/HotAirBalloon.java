package com.akshit.systemdesign.chapter6.adapterPattern;

public class HotAirBalloon {
    String gasUsed = "Helium";

    void start(String gas){
        System.out.println("Hot air balloon is starting..");
    }

    String getGasUsed(){
        return gasUsed;
    }
}
