package com.example.conc;

import com.example.abst.WeatherService;

public class WeatherServiceImpl implements WeatherService {
    @Override
    public WeatherData getWeatherData(String location) {

        return new WeatherData("30","Sunny");
    }
}
