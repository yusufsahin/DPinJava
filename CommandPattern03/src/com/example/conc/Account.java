package com.example.conc;

public class Account {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", balance is now " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ", balance is now " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }


}
