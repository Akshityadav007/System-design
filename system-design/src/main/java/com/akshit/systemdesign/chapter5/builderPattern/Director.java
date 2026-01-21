package com.akshit.systemdesign.chapter5.builderPattern;

public class Director {

    ICarBuilder carBuilder;

    public Director(ICarBuilder builder){
        this.carBuilder = builder;
    }

    // instruction
    public void construct(boolean engineNeeded, boolean bodyShellNeeded, boolean chassisNeeded, boolean tyreNeeded){
        if(engineNeeded)
            carBuilder.buildEngine();
        if(bodyShellNeeded)
            carBuilder.buildBodyShell();
        if(chassisNeeded)
            carBuilder.buildChassis();
        if(tyreNeeded)
            carBuilder.buildTyre();
    }
}
