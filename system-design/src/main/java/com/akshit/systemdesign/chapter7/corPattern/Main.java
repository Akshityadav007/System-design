package com.akshit.systemdesign.chapter7.corPattern;

public class Main {
    public static void main(String[] args){

        // 1. create the chain
        AbstractHandler pressureHandler = new PressureIssueHandler(null);
        EngineIssueHandler engineIssueHandler = new EngineIssueHandler(pressureHandler);

        // 2. prepare the request
        PressureIssueRequest pressureIssueRequest = new PressureIssueRequest();

        // 3. Send a pressure request/issue to engine request/issue handler
        engineIssueHandler.handleRequest(pressureIssueRequest);
    }
}
