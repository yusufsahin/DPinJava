package com.example.conc;

import com.example.abst.Animal;

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Miyav");
    }
}
