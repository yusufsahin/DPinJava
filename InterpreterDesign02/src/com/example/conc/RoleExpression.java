package com.example.conc;

import com.example.abst.Expression;

public class RoleExpression implements Expression {

    private String roleName;

    public RoleExpression(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean interpret(User user, Report report) {
        return user.getRoles().contains(roleName);
    }
}
