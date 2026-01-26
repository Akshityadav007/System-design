package com.akshit.systemdesign.chapter4.singletonPattern;

public class SingletonLazy {
    private SingletonLazy(){}

    // Important: need to create a nested class
    private static class Holder{
        private static final SingletonLazy  INSTANCE = new SingletonLazy();
    }

    public static SingletonLazy getInstance(){
        return Holder.INSTANCE;     // this is where the object is created i.e. object creation on demand / lazy initialization
    }
}
