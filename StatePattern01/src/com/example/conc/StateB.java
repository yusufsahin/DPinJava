package com.example.conc;

import com.example.abst.State;

public class StateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling State B");
        context.setState(new StateC());
    }
}
