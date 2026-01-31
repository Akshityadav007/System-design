package com.akshit.systemdesign.chapter7.cmdPattern;

public class Main {
    public static void main(String[] args){

        // set up the system
        BreakMechanism breakMechanism = new BreakMechanism();
        AirSuspensionMechanism airSuspensionMechanism = new AirSuspensionMechanism();

        EngageBreakCommand breakCommand = new EngageBreakCommand(breakMechanism);
        AirSuspensionCommand airSuspensionCommand = new AirSuspensionCommand(airSuspensionMechanism);

        Panel btnPanel = new Panel();

        btnPanel.setCommands(0, airSuspensionCommand);
        btnPanel.setCommands(1, breakCommand);

        // use the system
        btnPanel.liftSuspension();
        btnPanel.applyBreak();
    }
}
