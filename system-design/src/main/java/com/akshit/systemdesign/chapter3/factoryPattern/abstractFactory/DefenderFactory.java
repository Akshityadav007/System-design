package com.akshit.systemdesign.chapter3.factoryPattern.abstractFactory;

public class DefenderFactory implements IVehicleFactory{

    public void createEngine() {
        System.out.println("Creating Defender's Engine.");
    }
}
