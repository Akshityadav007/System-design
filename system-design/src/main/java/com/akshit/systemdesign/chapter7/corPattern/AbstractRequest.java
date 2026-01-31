package com.akshit.systemdesign.chapter7.corPattern;

public abstract class AbstractRequest {

    private int requestCode;

    AbstractRequest(int reqCode){
        this.requestCode = reqCode;
    }

    public int getRequestCode(){
        return requestCode;
    }
}
