package com.example.conc;

import com.example.abst.BankAccount;
import com.example.abst.InsurancePolicy;

public class SavingsAccount extends BankAccount {

    private  double balance;

    public SavingsAccount(InsurancePolicy insurancePolicy) {
        super(insurancePolicy);
        this.balance = 0;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
    @Override
    public double checkBalance() {
        return balance;
    }
}
