package com.akshit.systemdesign.chapter7.observePattern;

public class Boeing implements IAircraft, IObserver {

    ISubject tower;

    public Boeing(ATCTower tower){
        this.tower = tower;
    }

    @Override
    public void land() {
        // unsubscribe the subject
        System.out.println("Boeing has landed.");
        tower.removeObserver(this);
    }

    @Override
    public void fly(){
        // subscribe the subject
        tower.addObserver(this);
        System.out.println("Boeing is flying..");
    }

    @Override
    public void proceed(Object newState) {
        System.out.println("Executing the proceed method of aircraft.");
    }
}
