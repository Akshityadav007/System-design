package com.akshit.systemdesign.chapter6.bridgePattern;

public class Main {
    public static void main(String[] args){
        AbstractScorpio scorpioIndia = new ScorpioN(new ScorpioN_Impl_India());
        System.out.println(scorpioIndia.isRightHanded());

        AbstractScorpio scorpioUS = new ScorpioN(new ScorpioN_Impl_US());
        System.out.println(scorpioUS.isRightHanded());
    }
}
