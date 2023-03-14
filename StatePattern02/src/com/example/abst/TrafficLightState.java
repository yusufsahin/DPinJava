package com.example.abst;

import com.example.conc.TrafficLight;

public interface TrafficLightState {
    public void handle(TrafficLight light);
}
