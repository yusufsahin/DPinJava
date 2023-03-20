package com.example.conc;

import com.example.abst.DataPoint;
import com.example.abst.Visitor;

public class Belongings implements DataPoint {

    private double value;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
