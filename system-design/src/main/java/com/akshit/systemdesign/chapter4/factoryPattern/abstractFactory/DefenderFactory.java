package com.akshit.systemdesign.chapter4.factoryPattern.abstractFactory;

public class DefenderFactory implements IVehicleFactory{

    public void createEngine() {
        System.out.println("Creating Defender's Engine.");
    }
}
