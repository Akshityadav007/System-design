package com.akshit.systemdesign.chapter6.bridgePattern;

public class ScorpioN_Impl_US extends AbstractScorpioImpl{

    void printSafetyReq(){
        System.out.println("Safety req for US region");
    }

    boolean isRightHanded(){
        return false;
    }
}
