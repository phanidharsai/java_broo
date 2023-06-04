package com.phanidharsai.strings;

import java.util.Scanner;

public class AmstrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        int sum=0;
        for(char c: input.toCharArray()){
            sum = sum + (int)Math.pow(Character.getNumericValue(c),input.length());
        }
        if(String.valueOf(sum).equals(input)){
            System.out.println("Amstrong number");
        }
        else
            System.out.println("Not an Amstrong number");
    }
}
