package com.phanidharsai.solidprinciples.dependencyinversion.invalid;

public class Main {
    public static void main(String[] args){
        CalculateInterest cI = new CalculateInterest();
        cI.calculate(1000,"Home");
        cI.calculate(1000,"Crop");

    }
}
