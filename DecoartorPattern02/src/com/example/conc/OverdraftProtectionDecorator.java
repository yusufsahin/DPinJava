package com.example.conc;

import com.example.abst.BankAccount;
import com.example.abst.BankAccountDecorator;

public class OverdraftProtectionDecorator extends BankAccountDecorator {

    private  double overdraftLimit;
    public OverdraftProtectionDecorator(BankAccount bankAccount,double overdraftLimit) {
        super(bankAccount);
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public void withdraw(double amount)
    {
        if(amount<= bankAccount.getBalance()+ overdraftLimit)
        {
            bankAccount.withdraw(amount);
        }
        else {
            System.out.println("Overdraft limit reached!");
        }
    }
}
