package com.unifesp.testCasePrioritization.UseCases;

import com.unifesp.testCasePrioritization.Entities.TestCase;

import java.util.List;

public class Tiebreaker {
    public static List<TestCase> tiebreakerByExecutionTime(List<TestCase> testCases){
        testCases.sort((tc1, tc2) -> {
            int prioritizationFactor = Double.compare(tc1.getPrioritizationFactor(), tc2.getPrioritizationFactor());
            //If the prioritization factors are the same, the tie is broken by the shortest execution time
            if (prioritizationFactor == 0) {
                prioritizationFactor = Integer.compare(tc1.getApproximateExecutionTime(), tc2.getApproximateExecutionTime());
            }
            return prioritizationFactor;
        });
        return testCases;
    }
}