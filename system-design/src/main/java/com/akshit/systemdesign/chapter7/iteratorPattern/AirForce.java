package com.akshit.systemdesign.chapter7.iteratorPattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AirForce {

    List<IAircraft> jets = new ArrayList<>();

    IAircraft [] helis = new IAircraft[1];

    LinkedList<Boeing> cargo = new LinkedList<>();

    public AirForce(){
        jets.add(new Tejas());
        helis[0] = new Chinook();
        cargo.add(new Boeing());
    }

    public List<IAircraft> getJets() {
        return jets;
    }

    public IAircraft[] getHelis() {
        return helis;
    }

    public LinkedList<Boeing> getCargo() {
        return cargo;
    }

    // create an Airforce level iterator

    public AirForceIterator createIterator(){
        return new AirForceIterator(this);
    }
}
