package com.example.conc;

public class InsurancePolicyMemento {
    private final String policyName;
    private final int policyNumber;
    private final String policyType;

    public InsurancePolicyMemento(String policyName, int policyNumber, String policyType) {
        this.policyName = policyName;
        this.policyNumber = policyNumber;
        this.policyType = policyType;
    }

    public String getPolicyName() {
        return policyName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }
}
