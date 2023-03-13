package com.example.conc;

import com.example.abst.Category;

public class SimpleCategory implements Category {

    private  String name;

    public SimpleCategory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Category category) {
            //Uygulanabilir değil
    }

    @Override
    public void remove(Category category) {
        //Uygulanabilir  değil
    }

    @Override
    public void displayHierarchy() {
        System.out.println(getName());
    }
}
