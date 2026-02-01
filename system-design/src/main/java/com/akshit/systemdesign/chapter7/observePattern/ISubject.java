package com.akshit.systemdesign.chapter7.observePattern;

public interface ISubject {

    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
