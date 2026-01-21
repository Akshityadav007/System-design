package com.akshit.systemdesign.chapter5.builderPattern;

import com.akshit.systemdesign.chapter5.builderPattern.Models.Scorpio;
import com.akshit.systemdesign.chapter5.builderPattern.Models.ICar;

public class ScorpioBuilder implements ICarBuilder{

    Scorpio s1;

    @Override
    public void buildEngine(){
        System.out.println("Creating Scorpio Engine");
    }

    @Override
    public void buildChassis(){
        System.out.println("Creating Scorpio Chassis");
    }

    @Override
    public void buildTyre(){
        System.out.println("Creating Scorpio tyre");
    }

    @Override
    public void buildBodyShell(){
        System.out.println("Creating Scorpio body shell");
    }

    @Override
    public ICar build(){
        System.out.println("Scorpio is ready!");
        return s1;
    }
}
