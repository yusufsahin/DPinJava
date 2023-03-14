package com.example.conc;

import com.example.abst.PolicyManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class PolicyManagementSystemImpl implements PolicyManagementSystem {

    private Map<String,Policy> policies;

    public Map<String, Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(Map<String, Policy> policies) {
        this.policies = policies;
    }

    public PolicyManagementSystemImpl() {
        this.policies=new HashMap<>();
    }

    @Override
    public void purchasePolicy(String policyType, int coverageLevel, int premium, String policyHolderInfo) {
        Policy policy = new Policy(policyType, coverageLevel, premium, policyHolderInfo);
        policies.put(policy.getPolicyNumber(), policy);
    }

    @Override
    public void updatePolicy(String policyNumber, int coverageLevel, int premium, String policyHolderInfo) {
        if (policies.containsKey(policyNumber)) {
            Policy policy = policies.get(policyNumber);
            policy.setCoverageLevel(coverageLevel);
            policy.setPremium(premium);
            policy.setPolicyHolderInfo(policyHolderInfo);
            System.out.println("Policy updated: " + policy);
        } else {
            System.out.println("Policy not found: " + policyNumber);
        }

    }

    @Override
    public void fileClaim(String policyNumber, String claimInfo) {
        if (policies.containsKey(policyNumber)) {
            Policy policy = policies.get(policyNumber);
            policy.fileClaim(claimInfo);
            System.out.println("Claim filed: " + policy.getPolicyType() + " policy, " + policy.getPolicyNumber() + ", " + claimInfo);
        } else {
            System.out.println("Policy not found: " + policyNumber);
        }
    }
}
