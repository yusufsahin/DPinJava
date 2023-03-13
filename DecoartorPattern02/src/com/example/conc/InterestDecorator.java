package com.example.conc;

import com.example.abst.BankAccount;
import com.example.abst.BankAccountDecorator;

public class InterestDecorator extends BankAccountDecorator {
    private  double interestRate;
    public InterestDecorator(BankAccount bankAccount,double interestRate) {
        super(bankAccount);
        this.interestRate=interestRate;
    }

    @Override
    public void  deposit(double amount)
    {
        bankAccount.deposit(amount*(1+interestRate));
    }
}
