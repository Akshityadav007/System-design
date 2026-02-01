package com.akshit.systemdesign.chapter7.mediatorPattern;

public class Indigo implements IAircraft{

    ATCTower atcTower;

    public Indigo(ATCTower tower){
        this.atcTower = tower;
    }

    @Override
    public void land(){
        System.out.println("Indigo is landing.");
    }

    public void requestPermForLanding(){
        System.out.println("Requesting atc tower to land...");
        atcTower.requestToLand(this);
    }
}
