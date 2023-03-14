package com.example.abst;

import com.example.conc.Subject;

public abstract class Observer {
    protected Subject subject;
    public  abstract  void  update();

}
