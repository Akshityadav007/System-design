package com.akshit.systemdesign.chapter4.factoryPattern.abstractFactory;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args){
        IVehicleFactory factory1 = new ScorpioFactory();
        IVehicleFactory factory2 = new DefenderFactory();
        Car car1 = new Car(factory1);
        Car car2 = new Car(factory2);

        Collection <Car> carList= new ArrayList<>();    // Use vector in C++
        carList.add(car1);
        carList.add(car2);

        for(Car c: carList){
            c.driveCar();
        }
    }
}
