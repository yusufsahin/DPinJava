package com.example.conc;

import com.example.abst.TV;

public class SamsungTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("Samsung TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV turned off");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Samsung TV changed to channel " + channel);
    }
}
