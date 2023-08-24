/** input: 12345
 * output: 15
 * */

package com.phanidharsai.strings;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = input.length()-1;
        int sum=0;
        while(len>=0){
//            sum=sum+Integer.parseInt(String.valueOf(len));  // converting to string and then converting to integer
            sum = sum + Character.getNumericValue(input.charAt(len)); //converting to integer directly
            len--;
        }

/*  without using inbuilt functions   */
//        int numInput = Integer.parseInt(input);
//        while(numInput > 0){
//            sum=sum+numInput%10;
//            numInput=numInput/10;
//        }
        System.out.println(sum);
    }
}
