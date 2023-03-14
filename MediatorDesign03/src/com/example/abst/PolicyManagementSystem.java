package com.example.abst;

import java.util.HashMap;

public interface PolicyManagementSystem {
    void purchasePolicy(String policyType, int coverageLevel, int premium, String policyHolderInfo);
    void updatePolicy(String policyNumber, int coverageLevel, int premium, String policyHolderInfo);
    void fileClaim(String policyNumber, String claimInfo);


}
