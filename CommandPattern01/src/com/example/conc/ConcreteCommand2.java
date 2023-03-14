package com.example.conc;

import com.example.abst.Command;
import com.example.abst.Receiver;

public class ConcreteCommand2 implements Command {
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action2();;
    }
}
