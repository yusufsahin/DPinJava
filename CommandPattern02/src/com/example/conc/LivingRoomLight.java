package com.example.conc;

import com.example.abst.Light;

public class LivingRoomLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("Living room light is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Living room light is turned off");
    }
}
