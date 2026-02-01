package com.akshit.systemdesign.chapter7.observePattern;

import java.util.ArrayList;
import java.util.List;

public class ATCTower implements ISubject{

    List<IObserver> observers = new ArrayList<>();
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer: observers){
            // apply logic accordingly
            // notify each observer
            observer.proceed(this);
        }
    }
}
