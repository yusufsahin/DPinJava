package com.example.conc;

import com.example.abst.TrafficLightState;

public class GreenState implements TrafficLightState {
    @Override
    public void handle(TrafficLight light) {
        // Implementation for Green state
        System.out.println("Green light: Go!");
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        light.setState(new YellowState()); // Transition to Yellow state

    }
}
