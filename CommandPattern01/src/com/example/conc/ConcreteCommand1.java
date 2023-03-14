package com.example.conc;

import com.example.abst.Command;
import com.example.abst.Receiver;

public class ConcreteCommand1 implements Command {

    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action1();

    }
}
