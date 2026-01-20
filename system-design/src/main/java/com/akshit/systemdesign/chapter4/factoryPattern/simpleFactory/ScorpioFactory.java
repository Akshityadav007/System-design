package com.akshit.systemdesign.chapter4.factoryPattern.simpleFactory;

public class ScorpioFactory {

    public Scorpio createScorpio(char type){
        return switch (type) {      // this is enhanced switch
            case 'N' -> new ScorpioN();
            case 'C' -> new ScorpioClassic();
            default -> new Scorpio();
        };
    }

}
