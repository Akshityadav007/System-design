package com.akshit.systemdesign.chapter5.builderPattern;

import com.akshit.systemdesign.chapter5.builderPattern.Models.Fortuner;
import com.akshit.systemdesign.chapter5.builderPattern.Models.ICar;

public class FortunerBuilder implements ICarBuilder{

    Fortuner f1;

    @Override
    public void buildEngine(){
        System.out.println("Creating Fortuner Engine");
    }

    @Override
    public void buildChassis(){
        System.out.println("Creating Fortuner Chassis");
    }

    @Override
    public void buildTyre(){
        System.out.println("Creating Fortuner tyre");
    }

    @Override
    public void buildBodyShell(){
        System.out.println("Creating Fortuner body shell");
    }

    @Override
    public ICar build(){
        System.out.println("Fortuner is ready!");
        return f1;
    }
}
