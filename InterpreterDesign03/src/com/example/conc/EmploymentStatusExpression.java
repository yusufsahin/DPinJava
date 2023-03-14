package com.example.conc;

import com.example.abst.Expression;

public class EmploymentStatusExpression  implements Expression {

    private String employmentStatus;

    public EmploymentStatusExpression(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }


    @Override
    public boolean interpret(Context context) {
        return context.getEmploymentStatus().equalsIgnoreCase(employmentStatus);
    }
}
