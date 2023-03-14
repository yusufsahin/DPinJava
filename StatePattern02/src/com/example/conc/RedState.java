package com.example.conc;

import com.example.abst.TrafficLightState;

public class RedState implements TrafficLightState {
    @Override
    public void handle(TrafficLight light) {
        // Implementation for Red state
        System.out.println("Red light: Stop!");
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        light.setState(new GreenState()); // Transition to Green state

    }
}
