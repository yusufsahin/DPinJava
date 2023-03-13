package com.example.conc;

public class WeatherData {
    private  String location;
    private String temp;

    public WeatherData(String temp,String location) {
        this.location = location;
        this.temp=temp;
    }

    public String getLocation() {
        return location;
    }

    public String getTemp()
    {
        return "30";
    }

}
