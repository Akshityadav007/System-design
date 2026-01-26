package com.akshit.systemdesign.chapter3.factoryPattern.simpleFactory;

public class simpleFactory {
    public static void main(String[] args){
        ScorpioFactory factory = new ScorpioFactory();
        Scorpio obj = factory.createScorpio('C');
        obj.driveScorpio();

        Scorpio obj2 = factory.createScorpio('N');
        obj2.driveScorpio();
    }
}
