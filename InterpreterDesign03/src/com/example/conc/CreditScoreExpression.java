package com.example.conc;

import com.example.abst.Expression;

public class CreditScoreExpression implements Expression {

    private  int creditScore;

    public CreditScoreExpression(int creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getCreditScore()>=creditScore;
    }
}
