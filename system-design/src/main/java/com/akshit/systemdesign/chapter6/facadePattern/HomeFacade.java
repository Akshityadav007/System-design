package com.akshit.systemdesign.chapter6.facadePattern;

public class HomeFacade {

    PlumberSystem plumberSystem;
    ElectricSystem electricSystem;
    GasSystem gasSystem;
    WaterSystem waterSystem;

    void geyserOn() {
        // all interactions with systems will be done here
    }

    void geyserOff(){}

    void stoveOff(){}
    void stoveOn() {}
}
