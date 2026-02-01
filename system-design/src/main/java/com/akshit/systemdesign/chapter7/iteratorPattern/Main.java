package com.akshit.systemdesign.chapter7.iteratorPattern;

public class Main {
    public static void main(String[] args){
        AirForce airForce = new AirForce();

        ICustomIterator allPlanes = airForce.createIterator();

        while(allPlanes.hasNext()){
            System.out.println(allPlanes.next());
        }
    }
}
