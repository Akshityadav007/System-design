package com.akshit.systemdesign.chapter5.PrototypePattern;

public class Main {
    public static void main(String[] args){
        // create a prototype (that should be copied)

        // shallow copy
        IScorpioPrototype scorpioPrototype = new Scorpio();

        // create a Scorpio N
        IScorpioPrototype scorpioN = scorpioPrototype.clone();
        scorpioN.setEngine(new ScorpioNEngine());

        // create a Scorpio classic
        IScorpioPrototype scorpioClassic = scorpioPrototype.clone();
        scorpioClassic.setEngine(new ScorpioClassicEngine());



        // deep copy
        IScorpioPrototype scorpioDeepPrototype = new ScorpioDeepCopy();

        // create a Scorpio N
        IScorpioPrototype scorpioDeepN = scorpioDeepPrototype.clone();
        scorpioDeepN.setEngine(new ScorpioNEngine());

        // create a Scorpio classic
        IScorpioPrototype scorpioDeepClassic = scorpioPrototype.clone();
        scorpioDeepClassic.setEngine(new ScorpioClassicEngine());
    }
}
