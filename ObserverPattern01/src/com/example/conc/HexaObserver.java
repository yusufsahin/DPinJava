package com.example.conc;

import com.example.abst.Observer;

public class HexaObserver extends Observer {

    private Subject subject;

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );

    }
}
