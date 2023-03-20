package com.example.conc;

public class ServiceUsage {
    private String serviceName;
    private int usage;

    public ServiceUsage(String serviceName, int usage) {
        this.serviceName = serviceName;
        this.usage = usage;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getUsage() {
        return usage;
    }

}
