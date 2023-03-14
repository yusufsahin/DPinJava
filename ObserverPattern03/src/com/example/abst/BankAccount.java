package com.example.abst;

public interface BankAccount {
    public void registerObserver(AccountObserver observer);
    public void removeObserver(AccountObserver observer);
    public void notifyObservers();
    public void deposit(double amount);
    public void withdraw(double amount);
    public double getBalance();

}
