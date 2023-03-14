package com.example.conc;

import com.example.abst.State;

public class StateC implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling State C");

        context.setState(new StateA());
    }
}
