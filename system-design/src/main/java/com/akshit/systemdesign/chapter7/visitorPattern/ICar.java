package com.akshit.systemdesign.chapter7.visitorPattern;

public interface ICar{

    // this is very important function from double dispatch POV.

    void accept(ICarVisitor carVisitor);
}
