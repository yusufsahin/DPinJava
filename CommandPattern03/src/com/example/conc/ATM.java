package com.example.conc;

import com.example.abst.Command;

public class ATM {

    private Command depositCommand;
    private Command withdrawCommand;

    public ATM(Command depositCommand, Command withdrawCommand) {
        this.depositCommand = depositCommand;
        this.withdrawCommand = withdrawCommand;
    }

    public void deposit()
    {
        depositCommand.execute();
    }

    public  void withdraw()
    {
        withdrawCommand.execute();
    }
}
