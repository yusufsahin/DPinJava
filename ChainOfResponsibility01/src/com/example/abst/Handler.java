package com.example.abst;

import com.example.conc.Request;

public interface Handler {
    void setNextHandler(Handler nextHandler);
    void  handleRequest(Request request);
}
