package com.akshit.systemdesign.chapter7.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ATCTower {

    // need to have data of all planes
    List<IAircraft> queueForLanding = new ArrayList<>();

    synchronized public void requestToLand(IAircraft aircraft) {
        if (queueForLanding.isEmpty()) {
            System.out.println("Permission to land granted.");
            aircraft.land();
        }
        else{
            queueForLanding.add(aircraft);
        }
    }
}
