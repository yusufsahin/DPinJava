package com.example.conc;

public class Request {
    private String requestType;

    private String requestDescription;

    private  boolean isHandled;

    public Request(String requestType, String requestDescription, boolean isHandled) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
        this.isHandled = isHandled;
    }

    public Request(String requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public boolean isHandled() {
        return isHandled;
    }

    public void setHandled(boolean handled) {
        isHandled = handled;
    }
}
