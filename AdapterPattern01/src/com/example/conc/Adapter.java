package com.example.conc;

import com.example.abst.TargetInterface;

public class Adapter implements TargetInterface {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
