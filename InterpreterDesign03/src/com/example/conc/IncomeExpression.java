package com.example.conc;

import com.example.abst.Expression;

public class IncomeExpression  implements Expression {
    private int income;

    public IncomeExpression(int income) {
        this.income = income;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getIncome()>=income;
    }
}
