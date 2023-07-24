package com.phanidharsai.strings;

import java.util.Scanner;

public class PasswordChecker {
    private static String validatePassword(String input) {
        if(input.length()!=16){
            return "invalid password";
        }
        int count =0;
        for(int i=0;i<input.length();i++){
            if(!(Character.isLetterOrDigit(input.charAt(i)))){
                return "invalid password";
            }
            if(Character.isDigit(input.charAt(i))){
                count++;
            }
        }
        if(count<2){
            return "invalid password";
        }
        return "valid password";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String res= validatePassword(input);
        System.out.println(res);
    }
}
