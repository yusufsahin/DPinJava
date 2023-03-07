package com.example.conc;

import java.time.LocalDateTime;

public class Logger {
    private static Logger intance;

    private Logger(){}

    public static Logger getInstance()
    {
        if(intance==null)
        {
            intance= new Logger();
        }
        return  intance;
    }

    public  void  log(String message)
    {
        LocalDateTime timestamp= LocalDateTime.now();

        String formattedMessage=String.format("[%s] %s",timestamp,message);

        System.out.println(formattedMessage);
    }
}
