package com.akshit.systemdesign.chapter7.visitorPattern;

public class Scorpio implements ICar{

    // important function for double dispatch
    @Override
    public void accept(ICarVisitor carVisitor) {
        // V.V.V. Important function
        System.out.println("Inside Scorpio class");
        carVisitor.visitScorpio(this);
    }
}
