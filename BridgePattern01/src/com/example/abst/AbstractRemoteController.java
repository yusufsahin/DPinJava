package com.example.abst;

public abstract class AbstractRemoteController {
    private TV tv;

    public AbstractRemoteController(TV tv)
    {
        this.tv=tv;
    }

    public  void  turnOn(){
        tv.turnOn();
    }

    public  void  turnOf()
    {
        tv.turnOff();
    }

    public  void setChannel(int channel)
    {
        tv.changeChannel(channel);
    }
}
