package com.example.conc;

import java.util.Stack;

public class Caretaker {
    private final Stack<InsurancePolicyMemento> mementoStack = new Stack<>();
    public void savePolicy(InsurancePolicy policy) {
        mementoStack.push(policy.save());
    }

    public void restorePolicy(InsurancePolicy policy) {
        if (!mementoStack.isEmpty()) {
            policy.restore(mementoStack.pop());
        }
    }

}
