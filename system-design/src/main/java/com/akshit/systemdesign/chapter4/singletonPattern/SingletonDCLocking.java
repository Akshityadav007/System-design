package com.akshit.systemdesign.chapter4.singletonPattern;

public class SingletonDCLocking {
    private volatile static SingletonDCLocking instance;

    private SingletonDCLocking(){}

    synchronized public static SingletonDCLocking getInstance(){
        // only instantiate the object when needed
        if(instance == null){
            synchronized (SingletonDCLocking.class){
                if(instance == null){
                    instance = new SingletonDCLocking();
                }
            }
        }
        return instance;
    }
}
