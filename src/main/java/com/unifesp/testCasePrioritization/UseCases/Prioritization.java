package com.unifesp.testCasePrioritization.UseCases;

import com.unifesp.testCasePrioritization.Entities.Request;
import com.unifesp.testCasePrioritization.Entities.TestCase;

import java.util.List;

public class Prioritization {
    public static List<TestCase> generatePrioritization(List<TestCase> testCases){
        //Generate prioritization factor
        for (TestCase t : testCases) {
            t.setPrioritizationFactor(PrioritizationFactor.euclideanDistance(t));
        }
        //Sort the list by prioritization factor and break ties by time
        List<TestCase> prioritized = Tiebreaker.tiebreakerByExecutionTime(testCases);

        return prioritized;
    }
}