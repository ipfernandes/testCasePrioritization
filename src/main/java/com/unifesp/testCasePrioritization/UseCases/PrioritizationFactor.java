package com.unifesp.testCasePrioritization.UseCases;

import com.unifesp.testCasePrioritization.Entities.TestCase;

public class PrioritizationFactor {
    public static double euclideanDistance(TestCase t){

        //The test case with the highest priority has the following characteristics
        TestCase topPriority = new TestCase("highestPriority", 0, 0, 0, 0, 0, 0);

        //There are two groups of factors, primary and secondary. Each group has a weight of importance
        double primaryFactorWeight = 1.0;
        double secondaryFactorWeight = 0.5;

        //we calculate the distance between the test case and the test case with the highest possible priority
        double firstFactor = primaryFactorWeight * (Math.pow(topPriority.getProcessImportance() - t.getProcessImportance(), 2));
        double secondFactor = secondaryFactorWeight * (Math.pow(topPriority.getExecutionComplexity() - t.getExecutionComplexity(), 2));
        double thirdFactor = primaryFactorWeight * (Math.pow(topPriority.getPossibleFaultPriority() - t.getPossibleFaultPriority(), 2));
        double fourthFactor = primaryFactorWeight * (Math.pow(topPriority.getPossibleFaultCriticity() - t.getPossibleFaultCriticity(), 2));
        // the fifth factor is execution time, it will only be used as a tiebreaker criterion
        double sixthFactor = primaryFactorWeight * (Math.pow(topPriority.getCustomerPerception() - t.getCustomerPerception(), 2));

        double prioritizationFactor = Math.sqrt(firstFactor + secondFactor + thirdFactor + fourthFactor + sixthFactor);
        return prioritizationFactor;
    }
}