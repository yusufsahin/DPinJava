package com.example.conc;

import com.example.abst.State;

public class Context {
    private State currentState;

    public Context() {
        this.currentState= new StateA();
    }

    public  void setState(State state)
    {
        this.currentState=state;
    }

    public  void  request()
    {
        this.currentState.handle(this);
    }
}
