package com.example.conc;

import com.example.abst.Animal;

public class Bird implements Animal {
    @Override
    public void speak() {
        System.out.println("Cik");
    }
}
