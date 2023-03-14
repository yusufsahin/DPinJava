package com.example.conc;

import com.example.abst.TrafficLightState;

public class YellowState implements TrafficLightState {
    @Override
    public void handle(TrafficLight light) {
        System.out.println("Yellow light: Prepare to stop.");
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        light.setState(new RedState()); // Transition to Red state

    }
}
