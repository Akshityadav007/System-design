package com.akshit.systemdesign.chapter6.PrototypePattern;

public class ScorpioDeepCopy implements IScorpioPrototype{

    // default engine
    ScorpioEngine engine;

    public ScorpioDeepCopy() {
        // default case
        this.engine = new ScorpioEngine();
    }

    private ScorpioDeepCopy(ScorpioEngine scorpioEngine){
        // deep copy - copy constructor
        this.engine = new ScorpioEngine(scorpioEngine);
    }

    @Override
    public IScorpioPrototype clone() {
        IScorpioPrototype clonedScorpio = new ScorpioDeepCopy(this.engine);
        return clonedScorpio;
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
