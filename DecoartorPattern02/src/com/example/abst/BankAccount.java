package com.example.abst;

public interface BankAccount {

    void deposit(double amount);
    void withdraw(double amount);

    double getBalance();
}
