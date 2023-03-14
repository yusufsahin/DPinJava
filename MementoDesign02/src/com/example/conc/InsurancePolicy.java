package com.example.conc;

public class InsurancePolicy {
    private String policyName;
    private int policyNumber;
    private String policyType;

    public InsurancePolicy(String policyName, int policyNumber, String policyType) {
        this.policyName = policyName;
        this.policyNumber = policyNumber;
        this.policyType = policyType;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
    public InsurancePolicyMemento save() {
        return new InsurancePolicyMemento(policyName, policyNumber, policyType);
    }

    public void restore(InsurancePolicyMemento memento) {
        this.policyName = memento.getPolicyName();
        this.policyNumber = memento.getPolicyNumber();
        this.policyType = memento.getPolicyType();
    }
}
