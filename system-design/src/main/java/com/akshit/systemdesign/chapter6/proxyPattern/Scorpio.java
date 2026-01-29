package com.akshit.systemdesign.chapter6.proxyPattern;

public class Scorpio implements ICar{

    @Override
    public void turnLeft() {
        System.out.println("Turned left in scorpio class.");
    }

    @Override
    public void turnRight() {
        System.out.println("Turned right in scorpio class.");
    }

    @Override
    public void goStraight() {
        System.out.println("Going straight in scorpio class.");
    }
}
