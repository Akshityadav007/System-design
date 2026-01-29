package com.akshit.systemdesign.chapter6.decoratorPattern;

public class Scorpio implements ICar{
    public void start(){
        System.out.println("Scorpio has started");
    }

    public void stop(){
        System.out.println("Scorpio has stopped");
    }

    public float getWeight(){
        return baseWeight;
    }
}
