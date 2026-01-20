package com.akshit.systemdesign.chapter4.factoryPattern.complexFactory;

import java.util.ArrayList;
import java.util.Collection;

public class complexFactory {
    public static void main(String[] args){
        Scorpio car1 = new ScorpioClassic();
        Scorpio car2 = new ScorpioN();

        Collection <Scorpio> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        for(Scorpio obj: carList){
            obj.driveScorpio();
        }
    }
}
