package com.akshit.systemdesign.chapter5.builderPattern;

import com.akshit.systemdesign.chapter5.builderPattern.Models.ICar;

public class Main {
    public static void main(String[] args) {
        ICarBuilder builder = new ScorpioBuilder();
        Director director = new Director(builder);

        // guidance
        director.construct(true, true, true, true);
        ICar car = builder.build();
    }
}
