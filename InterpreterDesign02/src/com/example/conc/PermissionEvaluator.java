package com.example.conc;

import com.example.abst.Expression;

public class PermissionEvaluator {
    private Expression expression;

    public PermissionEvaluator(Expression expression) {
        this.expression = expression;
    }

    public boolean hasPermission(User user,Report report)
    {
        return  expression.interpret(user,report);
    }
}
