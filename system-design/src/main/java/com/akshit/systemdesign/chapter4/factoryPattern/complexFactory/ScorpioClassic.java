package com.akshit.systemdesign.chapter4.factoryPattern.complexFactory;

import com.akshit.systemdesign.chapter4.factoryPattern.complexFactory.models.ScorpioClassicEngine;
import com.akshit.systemdesign.chapter4.factoryPattern.complexFactory.models.ScorpioClassicBodyShell;

public class ScorpioClassic extends Scorpio {

    @Override
    public void createScorpio() {
        this.engine = new ScorpioClassicEngine();
        this.bodyShell = new ScorpioClassicBodyShell();
        System.out.println("Created Scorpio Classic");
    }
    public void driveScorpio(){
        createScorpio();
        System.out.println("I am driving Scorpio Classic");
    }
}
