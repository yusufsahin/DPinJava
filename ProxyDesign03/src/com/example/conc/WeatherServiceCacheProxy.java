package com.example.conc;

import com.example.abst.WeatherService;

import java.util.HashMap;
import java.util.Map;

public class WeatherServiceCacheProxy implements WeatherService {
    private final WeatherService weatherService;
    private final Map<String, WeatherData> cache;

    public WeatherServiceCacheProxy(WeatherService weatherService) {
        this.weatherService = weatherService;
        this.cache = new HashMap<>();
    }

    @Override
    public WeatherData getWeatherData(String location) {
        WeatherData weatherData = cache.get(location);
        if (weatherData == null) {
            // If the weather data isn't in the cache, retrieve it from the external service
            weatherData = weatherService.getWeatherData(location);
            // Add the weather data to the cache
            cache.put(location, weatherData);
        }
        return weatherData;
    }
}

