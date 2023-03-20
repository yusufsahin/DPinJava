package com.example.abst;

public abstract class AbstractClass {
    public  final  void  templateMethod()
    {
        step1();
        step2();
        step3();
    }

    protected abstract void step1();
    protected abstract void step2();

    protected  abstract void step3();
}
