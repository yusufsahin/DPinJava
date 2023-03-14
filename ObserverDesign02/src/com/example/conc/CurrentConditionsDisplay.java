package com.example.conc;

import com.example.abst.Observer;
import com.example.abst.Subject;

public class CurrentConditionsDisplay implements Observer {
    private int temperature;
    private int humidity;
    private int pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }

}
