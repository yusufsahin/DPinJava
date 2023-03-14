package com.example.conc;

import com.example.abst.Expression;

public class AndExpression implements Expression {
    private final Expression expr1;
    private final Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(User user, Report report) {
        return expr1.interpret(user, report) && expr2.interpret(user, report);
    }
}
