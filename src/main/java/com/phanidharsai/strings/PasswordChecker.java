package com.phanidharsai.strings;

import java.util.Scanner;

public class PasswordChecker {
    private static String validatePassword(String input) {
        if(input.length()<16||input.toUpperCase().equals(input)||input.toLowerCase().equals(input)){
            return "invalid password";
        }
        int countD =0;
        int countS=0;
        for(int i=0;i<input.length();i++){
            if(!(Character.isLetterOrDigit(input.charAt(i))) && (Character.isWhitespace(input.charAt(i)))){
                return "invalid password";
            }
            if(!(Character.isLetterOrDigit(input.charAt(i)))){
                countS++;
            }
            if(Character.isDigit(input.charAt(i))){
                countD++;
            }
        }
        if(countD<2||countS<1){
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
