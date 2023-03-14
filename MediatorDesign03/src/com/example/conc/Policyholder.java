package com.example.conc;

import com.example.abst.PolicyManagementSystem;

public class Policyholder {
    private PolicyManagementSystem policyManagementSystem;

    public Policyholder(PolicyManagementSystem policyManagementSystem) {
        this.policyManagementSystem = policyManagementSystem;
    }
    public void purchasePolicy(String policyType, int coverageLevel, int premium, String policyHolderInfo) {
        policyManagementSystem.purchasePolicy(policyType, coverageLevel, premium, policyHolderInfo);
    }

    public void updatePolicy(String policyNumber, int coverageLevel, int premium, String policyHolderInfo) {
        policyManagementSystem.updatePolicy(policyNumber, coverageLevel, premium, policyHolderInfo);
    }

    public void fileClaim(String policyNumber, String claimInfo) {
        policyManagementSystem.fileClaim(policyNumber, claimInfo);
    }

}
