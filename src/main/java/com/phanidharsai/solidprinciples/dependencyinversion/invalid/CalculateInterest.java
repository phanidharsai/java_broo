/** Here calculateInterest class is dependent on Homeloan objects and Croploan objects which is a violation
 * of dependency inversion
 * */

package com.phanidharsai.solidprinciples.dependencyinversion.invalid;

public class CalculateInterest {
    public int calculate(int principal, String typeOfLoan){
        int result =0;
        switch(typeOfLoan){
            case "Home":
                HomeLoan hl= new HomeLoan();
                result=hl.calculateInterest(principal, 8);
                break;
            case "Crop":
                CropLoan cp = new CropLoan();
                result= cp.calculateInterest(principal, 4);
                break;
        }
        return result;
    }
}
