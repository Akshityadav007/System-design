package com.akshit.systemdesign.chapter7.observePattern;

public class Main {
    public static void main(String[] args){
        ATCTower tower = new ATCTower();
        Boeing boeing = new Boeing(tower);

        boeing.fly();
        tower.notifyObservers();
        boeing.land();
        tower.notifyObservers();

    }
}
