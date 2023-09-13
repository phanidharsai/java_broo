package com.phanidharsai.solidprinciples.dependencyinversion.valid;

public class CalculateInterest {
    public double calculateInterest(int principal, InterestCalculator type){
        return type.calculateInterest(principal);
    }
}
