package com.phanidharsai.strings;

import java.util.Scanner;

public class HasUpperLowerAndDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Password= sc.next();
        boolean digit = false;
        for(char c: Password.toCharArray()){
            if(Character.isDigit(c)) {
                digit = true;
            }
        }
        String U_Password=Password.toUpperCase();
        String L_Password= Password.toLowerCase();
        if(U_Password!=Password && L_Password!=Password && digit){
            System.out.println("Valid");
        }
        else
            System.out.println("Invalid");
    }
}
