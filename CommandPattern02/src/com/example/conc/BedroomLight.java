package com.example.conc;

import com.example.abst.Light;

public class BedroomLight  implements Light {
    @Override
    public void turnOn() {
            System.out.println("Bedroom light is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Bedroom light is turned off");
    }
}
