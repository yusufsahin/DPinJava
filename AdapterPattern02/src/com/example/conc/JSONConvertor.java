package com.example.conc;

public class JSONConvertor {
    public String convertToJSON(Object object)
    {
        return "{\"name\": \"" + object.toString() + "\"}";

    }
}
