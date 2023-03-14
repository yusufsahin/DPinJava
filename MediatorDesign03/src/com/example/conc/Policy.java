package com.example.conc;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Policy {
    private String policyType;
    private int coverageLevel;
    private int premium;
    private String policyHolderInfo;
    private String policyNumber;
    private List<String> claims;

    public Policy(String policyType, int coverageLevel, int premium, String policyHolderInfo) {
        this.policyType = policyType;
        this.coverageLevel = coverageLevel;
        this.premium = premium;
        this.policyHolderInfo = policyHolderInfo;
        this.policyNumber = UUID.randomUUID().toString();
        this.claims = new ArrayList<>();
    }

    public String getPolicyType() {
        return policyType;
    }

    public int getCoverageLevel() {
        return coverageLevel;
    }

    public void setCoverageLevel(int coverageLevel) {
        this.coverageLevel = coverageLevel;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public String getPolicyHolderInfo() {
        return policyHolderInfo;
    }

    public void setPolicyHolderInfo(String policyHolderInfo) {
        this.policyHolderInfo = policyHolderInfo;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public List<String> getClaims() {
        return claims;
    }

    public void fileClaim(String claimInfo) {
        claims.add(claimInfo);
    }

    @Override
    public String toString() {
        return policyType + " policy, " + policyNumber + ", coverage level: " + coverageLevel + ", premium: " + premium + ", policy holder: " + policyHolderInfo;
    }

}
