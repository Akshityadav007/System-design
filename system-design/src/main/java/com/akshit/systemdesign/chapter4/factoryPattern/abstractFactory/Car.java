package com.akshit.systemdesign.chapter4.factoryPattern.abstractFactory;

// abstract layer

import com.akshit.systemdesign.chapter4.factoryPattern.complexFactory.models.IEngine;

public class Car {
    IEngine engine;
    IVehicleFactory carFactory;

    Car(IVehicleFactory factory){
        carFactory = factory;
    }

    public void driveCar(){
        carFactory.createEngine();
        System.out.println("Car Engine created!");
    }
}
