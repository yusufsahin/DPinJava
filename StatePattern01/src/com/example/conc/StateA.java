package com.example.conc;

import com.example.abst.State;

public class StateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling State A");
        context.setState(new StateB());
    }
}
