package com.example.conc;

import com.example.abst.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> flyweights= new HashMap<>();

    public Flyweight getFlyweight(String key){
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight(key));
        }
        return flyweights.get(key);
    }
}
