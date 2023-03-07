package com.example.abst;

public abstract class BankAccount {
    public InsurancePolicy insurancePolicy;

    public BankAccount(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double checkBalance();
    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

}
