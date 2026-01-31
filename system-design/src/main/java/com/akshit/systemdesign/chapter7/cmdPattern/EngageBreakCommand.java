package com.akshit.systemdesign.chapter7.cmdPattern;

public class EngageBreakCommand implements Command{

    BreakMechanism breakMechanism;

    public EngageBreakCommand(BreakMechanism breaks){
        this.breakMechanism = breaks;
    }

    @Override
    public void execute(){
        breakMechanism.applyBreak();
    }
}
