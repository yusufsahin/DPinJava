package com.example.conc;

import com.example.abst.AccountObserver;
import com.example.abst.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccount implements BankAccount {
    private List<AccountObserver> observers;
    private double balance;

    public SavingsAccount() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(AccountObserver observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(AccountObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (AccountObserver observer : observers) {
            observer.update(balance);
        }

    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        notifyObservers();

    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        notifyObservers();

    }

    @Override
    public double getBalance() {
        return balance;
    }
}
