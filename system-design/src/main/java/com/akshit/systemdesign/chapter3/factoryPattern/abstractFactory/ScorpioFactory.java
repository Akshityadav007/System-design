package com.akshit.systemdesign.chapter3.factoryPattern.abstractFactory;

public class ScorpioFactory implements IVehicleFactory{
    public void createEngine(){
        System.out.println("Creating Scorpio Engine.");
    }
}
