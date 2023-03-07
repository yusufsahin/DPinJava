package com.example.conc;

import com.example.abst.Shape;

public class Square extends Shape {

    public Square()
    {
        setType("Square");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
