package com.akshit.systemdesign.chapter6.decoratorPattern;

public class BulletProof extends ScorpioDecorator {
    ICar scorpio;

    public BulletProof(ICar myScorpio){
        this.scorpio = myScorpio;
    }

    public void start(){
        scorpio.start();
    }

    public void stop(){
        scorpio.stop();
    }

    public float getWeight(){
        return baseWeight + 300f;
    }
}
