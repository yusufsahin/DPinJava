package com.example.conc;

public class Facade {
    private  SubSystemA subSystemA;
    private  SubSystemB subSystemB;

    public Facade() {
        this.subSystemA= new SubSystemA();
        this.subSystemB= new SubSystemB();
    }

    public void operationAB()
    {
        subSystemA.operationA();
        subSystemB.operationB();
    }
}
