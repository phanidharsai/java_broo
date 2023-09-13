package com.phanidharsai.solidprinciples.dependencyinversion.valid;

public class HomeLoan implements InterestCalculator{
    @Override
    public double calculateInterest(int principal) {
        // some calculation
         return 0;

    }
}
