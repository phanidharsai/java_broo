package com.phanidharsai.solidprinciples.dependencyinversion.valid;

public class CropLoan implements InterestCalculator{
    @Override
    public double calculateInterest(int principal) {
        return 0;
    }
}
