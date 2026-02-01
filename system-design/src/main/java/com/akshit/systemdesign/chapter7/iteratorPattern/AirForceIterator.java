package com.akshit.systemdesign.chapter7.iteratorPattern;

import java.util.LinkedList;
import java.util.List;

public class AirForceIterator implements ICustomIterator{

    // main logic is written here

    List<IAircraft> jets;
    IAircraft[] helis;
    LinkedList<Boeing> cargo;

    int jetsPos = 0;
    int helisPos = 0;
    int cargoPos = 0;

    public AirForceIterator(AirForce airForce){
        jets = airForce.getJets();
        helis = airForce.getHelis();
        cargo = airForce.getCargo();
    }

    @Override
    public IAircraft next() {
        if(helisPos < helis.length){
            return helis[helisPos++];
        }

        if(jetsPos < jets.size()){
            return jets.get(jetsPos++);
        }

        if(cargoPos < cargo.size()){
            return cargo.get(cargoPos++);
        }

        throw new RuntimeException("Index out of bounds.");
    }

    @Override
    public Boolean hasNext() {
        return helisPos < helis.length || jetsPos < jets.size() || cargoPos < cargo.size();
    }
}
