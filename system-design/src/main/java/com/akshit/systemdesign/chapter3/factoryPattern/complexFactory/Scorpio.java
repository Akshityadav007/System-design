package com.akshit.systemdesign.chapter3.factoryPattern.complexFactory;

import com.akshit.systemdesign.chapter3.factoryPattern.complexFactory.models.IBodyShells;
import com.akshit.systemdesign.chapter3.factoryPattern.complexFactory.models.IEngine;

public class Scorpio {

    IEngine engine;
    IBodyShells bodyShell;

    public void createScorpio() {
        System.out.println("Creating Scorpio");
    }
    public void driveScorpio(){
        System.out.println("I am driving Scorpio");
    }
}
