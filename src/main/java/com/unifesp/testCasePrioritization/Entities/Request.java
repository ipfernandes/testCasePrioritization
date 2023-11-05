package com.unifesp.testCasePrioritization.Entities;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class Request {

    private String externalId;
    @Valid
    private List<TestCase> testCases;

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public List<TestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<TestCase> testCases) {
        this.testCases = testCases;
    }

    public Request(String externalId, List<TestCase> testCases) {
        this.externalId = externalId;
        this.testCases = testCases;
    }
}