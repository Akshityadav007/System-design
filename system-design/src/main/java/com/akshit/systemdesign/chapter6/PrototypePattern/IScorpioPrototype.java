package com.akshit.systemdesign.chapter6.PrototypePattern;

public interface IScorpioPrototype {
    public IScorpioPrototype clone();

    // settle the differences (which occurs in different variants of clones)
    public void setEngine(ScorpioEngine scorpioEngine);

    public void start();
}
