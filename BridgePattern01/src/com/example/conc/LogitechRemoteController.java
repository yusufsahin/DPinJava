package com.example.conc;

import com.example.abst.AbstractRemoteController;
import com.example.abst.TV;

public class LogitechRemoteController extends AbstractRemoteController {
    public LogitechRemoteController(TV tv) {
        super(tv);
    }

    public  void setChannelBoard(int channel)
    {
        setChannel(channel);
        System.out.println("Logitech board changed channel "+channel);
    }
}
