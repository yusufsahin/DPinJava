package com.example.conc;

import com.example.abst.Expression;

public class OrExpression implements Expression{
    private  Expression expression1;
    private  Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(User user, Report report) {
        return expression1.interpret(user,report) || expression2.interpret(user,report);
    }
}
