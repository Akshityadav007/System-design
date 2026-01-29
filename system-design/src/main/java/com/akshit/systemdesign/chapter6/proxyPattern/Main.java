package com.akshit.systemdesign.chapter6.proxyPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // create a remote proxy
        RemoteProxy remoteProxy = new RemoteProxy();
        Scanner sc = new Scanner(System.in);

        while(true) {
            String action = sc.nextLine();
            switch (action){
                case "left":
                    remoteProxy.turnLeft();
                    break;
                case "right":
                    remoteProxy.turnRight();
                    break;
                case "straight":
                    remoteProxy.goStraight();
                    break;
                case "exit":
                    System.out.println("Exiting.. ");
                    return;
                default:
                    break;
            }
        }
    }
}
