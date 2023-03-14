package com.example.conc;

import com.example.abst.Expression;

public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number)
    {
        this.number=number;
    }
    @Override
    public int interpret() {
        return number;
    }
}
