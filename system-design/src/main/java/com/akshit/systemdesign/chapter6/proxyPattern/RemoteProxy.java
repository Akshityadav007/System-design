package com.akshit.systemdesign.chapter6.proxyPattern;

public class RemoteProxy implements ICar{

    private final Scorpio scorpio = new Scorpio();

    @Override
    public void turnLeft() {
        System.out.println("Inside the remote class.");
        scorpio.turnLeft();
    }

    @Override
    public void turnRight() {
        System.out.println("Inside the remote class.");
        scorpio.turnRight();
    }

    @Override
    public void goStraight() {
        System.out.println("Inside the remote class.");
        scorpio.goStraight();
    }
}
