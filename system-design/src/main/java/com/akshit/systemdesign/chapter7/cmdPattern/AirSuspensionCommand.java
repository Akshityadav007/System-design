package com.akshit.systemdesign.chapter7.cmdPattern;

public class AirSuspensionCommand implements Command{

    AirSuspensionMechanism airSuspensionMechanism;

    public AirSuspensionCommand(AirSuspensionMechanism airSusCmd){
        this.airSuspensionMechanism = airSusCmd;
    }

    @Override
    public void execute() {
        airSuspensionMechanism.liftSuspension();
    }
}
