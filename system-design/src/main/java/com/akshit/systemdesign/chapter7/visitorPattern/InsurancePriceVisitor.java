package com.akshit.systemdesign.chapter7.visitorPattern;

public class InsurancePriceVisitor implements ICarVisitor{
    // multiple visit functions specific to car type present below


    public void visitScorpio(Scorpio scorpio){
        System.out.println("I am visiting Ins Scorpio.");
    }

    public void visitAlto(Alto alto){
        System.out.println("I am visiting Ins Alto.");
    }
}
