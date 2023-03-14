package com.example.conc;

import com.example.abst.TrafficLightState;

public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        this.currentState=new GreenState();
    }

    public void setState(TrafficLightState state)
    {
        this.currentState=state;
    }
    public void operate() {
        // Delegate operation to the current state
        this.currentState.handle(this);
    }

}
