package com.example.conc;

import com.example.abst.DataPoint;
import com.example.abst.Visitor;

public class Age implements DataPoint {

    private int age;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
