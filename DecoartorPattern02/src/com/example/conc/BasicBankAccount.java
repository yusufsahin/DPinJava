package com.example.conc;

import com.example.abst.BankAccount;

public class BasicBankAccount  implements BankAccount {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        balance-=amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
