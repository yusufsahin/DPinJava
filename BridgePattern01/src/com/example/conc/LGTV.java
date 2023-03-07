package com.example.conc;

import com.example.abst.TV;

public class LGTV  implements TV {
    @Override
    public void turnOn() {
        System.out.println("LG TV turned on");
    }


    @Override
    public void turnOff() {
        System.out.println("LG TV turned off");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("LG TV changed to channel " + channel);
    }
}
