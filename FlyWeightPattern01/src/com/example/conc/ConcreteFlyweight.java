package com.example.conc;

import com.example.abst.Flyweight;

public class ConcreteFlyweight implements Flyweight {
    private  String intrinsicState;
    public ConcreteFlyweight(String instrinsicState) {
        this.intrinsicState=instrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {

        System.out.println("Intrinsic state: " + intrinsicState);
        System.out.println("Extrinsic state: " + extrinsicState);


    }
}
