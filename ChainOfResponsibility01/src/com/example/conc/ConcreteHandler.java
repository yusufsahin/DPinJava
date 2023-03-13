package com.example.conc;

import com.example.abst.Handler;

public class ConcreteHandler implements Handler {

    private  Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler=nextHandler;
    }

    @Override
    public void handleRequest(Request request) {

        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }else if (request.getRequestType().equals("Type1")) {
            System.out.println("Handling Type1 request: " + request.getRequestDescription());
            request.setHandled(true);
        } else {
            System.out.println("Request not handled");
        }

    }
}
