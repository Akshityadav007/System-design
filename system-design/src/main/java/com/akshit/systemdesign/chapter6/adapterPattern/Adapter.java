package com.akshit.systemdesign.chapter6.adapterPattern;

public class Adapter implements ICar{
    HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon ballon){
        this.hotAirBalloon = ballon;
    }

    public void start(){
        String gasToBeUsed = hotAirBalloon.gasUsed;
        hotAirBalloon.start(gasToBeUsed);
    }
}
