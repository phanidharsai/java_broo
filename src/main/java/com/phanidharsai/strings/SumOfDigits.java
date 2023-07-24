package com.phanidharsai.strings;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum=0;
        for(char c:input.toCharArray()){
//            sum=sum+Integer.parseInt(String.valueOf(c));  // converting to string and then converting to integer
            sum = sum + Character.getNumericValue(c); //converting to integer directly
        }

/*  without using inbuilt functions   */
//        int numInput = sc.nextInt();
//        while(numInput > 0){
//            sum=sum+numInput%10;
//            numInput=numInput/10;
//        }
        System.out.println(sum);
    }
}
