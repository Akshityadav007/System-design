package com.akshit.systemdesign.chapter7.visitorPattern;

public class DepreciationPriceVisitor implements ICarVisitor{

    public void visitScorpio(Scorpio scorpio){
        System.out.println("I am visiting Dep Scorpio.");
    }

    public void visitAlto(Alto alto){
        System.out.println("I am visiting Dep Alto.");
    }
}
