package com.akshit.systemdesign.chapter6.bridgePattern;

public class ScorpioN extends AbstractScorpio{

    public ScorpioN(AbstractScorpioImpl scorpioImpl){
        super(scorpioImpl);
    }

    void printSafetyReq(){
        scorpioImpl.printSafetyReq();
    }

    boolean isRightHanded(){
        return scorpioImpl.isRightHanded();
    }
}
