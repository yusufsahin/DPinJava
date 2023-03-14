package com.example.conc;

public class Context {

    private  int income;
    private  String employmentStatus;
    private int creditScore;

    public Context(int income, String employmentStatus, int creditScore) {
        this.income = income;
        this.employmentStatus = employmentStatus;
        this.creditScore = creditScore;
    }

    public int getIncome() {
        return income;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public int getCreditScore() {
        return creditScore;
    }
}
