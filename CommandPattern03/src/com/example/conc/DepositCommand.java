package com.example.conc;

import com.example.abst.Command;

public class DepositCommand implements Command {

    private Account account;
    private double amount;

    public DepositCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
            account.deposit(amount);
    }
}
