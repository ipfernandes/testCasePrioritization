package com.unifesp.testCasePrioritization.Entities;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class TestCase {
    @NotEmpty(message = "testCaseId is required")
    private String testCaseId;
    @Min(value = 0, message = "the minimum value allowed for processImportance is 0")
    @Max(value = 2, message = "the maximum value allowed for processImportance is 2")
    private int processImportance;
    @Min(value = 0, message = "the minimum value allowed for executionComplexity is 0")
    @Max(value = 3, message = "the maximum value allowed for executionComplexity is 3")
    private int executionComplexity;
    @Min(value = 0, message = "the minimum value allowed for possibleFaultPriority is 0")
    @Max(value = 2, message = "the maximum value allowed for possibleFaultPriority is 2")
    private int possibleFaultPriority;
    @Min(value = 0, message = "the minimum value allowed for possibleFaultCriticity is 0")
    @Max(value = 2, message = "the maximum value allowed for possibleFaultCriticity is 2")
    private int possibleFaultCriticity;
    @Min(value = 1, message = "the minimum value allowed for approximateExecutionTime in minutes is 1")
    private int approximateExecutionTime;
    @Min(value = 0, message = "the minimum value allowed for customerPerception is 0")
    @Max(value = 2, message = "the maximum value allowed for customerPerception is 2")
    private int customerPerception;
    private double prioritizationFactor;

    public String getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    public int getProcessImportance() {
        return processImportance;
    }

    public void setProcessImportance(int processImportance) {
        this.processImportance = processImportance;
    }

    public int getExecutionComplexity() {
        return executionComplexity;
    }

    public void setExecutionComplexity(int executionComplexity) {
        this.executionComplexity = executionComplexity;
    }

    public int getPossibleFaultPriority() {
        return possibleFaultPriority;
    }

    public void setPossibleFaultPriority(int possibleFaultPriority) {
        this.possibleFaultPriority = possibleFaultPriority;
    }

    public int getPossibleFaultCriticity() {
        return possibleFaultCriticity;
    }

    public void setPossibleFaultCriticity(int possibleFaultCriticity) {
        this.possibleFaultCriticity = possibleFaultCriticity;
    }

    public int getApproximateExecutionTime() {
        return approximateExecutionTime;
    }

    public void setApproximateExecutionTime(int approximateExecutionTime) {
        this.approximateExecutionTime = approximateExecutionTime;
    }

    public int getCustomerPerception() {
        return customerPerception;
    }

    public void setCustomerPerception(int customerPerception) {
        this.customerPerception = customerPerception;
    }

    public double getPrioritizationFactor() {
        return prioritizationFactor;
    }

    public void setPrioritizationFactor(double prioritizationFactor) {
        this.prioritizationFactor = prioritizationFactor;
    }

    public TestCase(String testCaseId, int processImportance, int executionComplexity, int possibleFaultPriority, int possibleFaultCriticity, int approximateExecutionTime, int customerPerception) {
        this.testCaseId = testCaseId;
        this.processImportance = processImportance;
        this.executionComplexity = executionComplexity;
        this.possibleFaultPriority = possibleFaultPriority;
        this.possibleFaultCriticity = possibleFaultCriticity;
        this.approximateExecutionTime = approximateExecutionTime;
        this.customerPerception = customerPerception;
    }
    public TestCase(){}
}