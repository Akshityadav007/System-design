package com.akshit.systemdesign.chapter3.factoryPattern.complexFactory;

import com.akshit.systemdesign.chapter3.factoryPattern.complexFactory.models.ScorpioNBodyShell;
import com.akshit.systemdesign.chapter3.factoryPattern.complexFactory.models.ScorpioNEngine;

public class ScorpioN extends Scorpio {

    @Override
    public void createScorpio() {
        this.engine = new ScorpioNEngine();
        this.bodyShell = new ScorpioNBodyShell();
        System.out.println("Created Scorpio N");
    }

    public void driveScorpio(){
        createScorpio();
        System.out.println("I am driving Scorpio N");
    }
}
