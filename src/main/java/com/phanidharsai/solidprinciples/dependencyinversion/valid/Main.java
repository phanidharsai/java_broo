package com.phanidharsai.solidprinciples.dependencyinversion.valid;



public class Main {
    public static void main(String[] args){
        CalculateInterest cI = new CalculateInterest();
        double amt=cI.calculateInterest(1000, new CropLoan());

    }
}
