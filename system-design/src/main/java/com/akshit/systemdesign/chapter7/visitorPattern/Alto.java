package com.akshit.systemdesign.chapter7.visitorPattern;

public class Alto implements ICar{
    @Override
    public void accept(ICarVisitor carVisitor) {
        // V.V.V. Important function
        System.out.println("Inside Alto class");
        carVisitor.visitAlto(this);
    }
}
