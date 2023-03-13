package com.example.abst;

import com.example.conc.WeatherData;

public interface WeatherService {
    public WeatherData getWeatherData(String location);

}
