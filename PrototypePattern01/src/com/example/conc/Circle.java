package com.example.conc;

import com.example.abst.Shape;

public class Circle extends Shape {

    public Circle()
    {
        setType("Circle");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
