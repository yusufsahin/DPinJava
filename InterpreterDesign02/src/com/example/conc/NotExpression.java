package com.example.conc;

import com.example.abst.Expression;

public class NotExpression implements Expression {
    private final Expression expr;

    public NotExpression(Expression expr) {
        this.expr = expr;
    }

    public boolean interpret(User user, Report report) {
        return !expr.interpret(user, report);
    }
}
