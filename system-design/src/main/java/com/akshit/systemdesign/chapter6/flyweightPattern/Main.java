package com.akshit.systemdesign.chapter6.flyweightPattern;

public class Main {
    public static void main(String[] args) {
        Tejas plane = new Tejas();

        // we don't need 100 objects to display 5 Tejas jets
        for(int i = 0; i < 5; i++){
            // fetch src location from location history
            int srcX = 5;
            int srcY = 10;

            int destX = 100;
            int destY = 515;

            int speed = 15;

            System.out.println("Time: " + plane.getTotalTimeToReachDestination(srcX, srcY, destX, destY, speed));
        }
    }
}
