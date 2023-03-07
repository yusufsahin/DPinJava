package com.example.conc;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private static Configuration intance;

    private Map<String,String> settings;

    private Configuration(){
        settings= new HashMap<String,String>();
        settings.put("serverUrl","localhost");
        settings.put("timeout","5000");
        settings.put("maxConnections","10");
    }

    public static  Configuration getInstance()
    {
        if(intance==null)
        {
            intance= new Configuration();
        }
        return intance;
    }

    public String getSettings(String name){
        return  settings.get(name);
    }

}
