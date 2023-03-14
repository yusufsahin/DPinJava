package com.example.conc;

import com.example.abst.Receiver;

public class ReceiverImpl  implements Receiver {
    @Override
    public void action1() {
        System.out.println("Receiver : performing action 1");
    }

    @Override
    public void action2() {
        System.out.println("Receiver : performing action 2");
    }
}
