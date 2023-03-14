package com.example.conc;

import com.example.abst.Command;

public class WithdrawCommand implements Command {

    private Account account;
    private  double amount;

    public WithdrawCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);

    }
}
