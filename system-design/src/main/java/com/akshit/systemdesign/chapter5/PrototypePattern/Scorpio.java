package com.akshit.systemdesign.chapter5.PrototypePattern;

public class Scorpio implements IScorpioPrototype{

    // default engine
    ScorpioEngine engine = new ScorpioEngine();

    @Override
    public IScorpioPrototype clone() {
        return new Scorpio();
    }

    @Override
    public void setEngine(ScorpioEngine scorpioEngine) {
        this.engine = scorpioEngine;
    }   // shallow copy

    @Override
    public void start(){
        System.out.println("Scorpio started...");
    }
}
