package com.akshit.systemdesign.chapter6.decoratorPattern;

public interface ICar {
    float baseWeight = 1500;
    void start();
    void stop();
    float getWeight();
}
