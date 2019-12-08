package com.example.model;

public class MemoryUsage {

    private final double minMemory;
    private final double maxMemory;

    public MemoryUsage(double minMemory, double maxMemory) {
        this.minMemory = minMemory;
        this.maxMemory = maxMemory;
    }

    public double getMinMemory() {
        return minMemory;
    }

    public double getMaxMemory() {
        return maxMemory;
    }
}
