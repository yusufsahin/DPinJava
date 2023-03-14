package com.example.conc;

import java.util.Set;

public class Report {
    private String reportName;
    private Set<String> allowedRoles;

    public Report(String reportName, Set<String> allowedRoles) {
        this.reportName = reportName;
        this.allowedRoles = allowedRoles;
    }

    public String getReportName() {
        return reportName;
    }

    public Set<String> getAllowedRoles() {
        return allowedRoles;
    }
}
