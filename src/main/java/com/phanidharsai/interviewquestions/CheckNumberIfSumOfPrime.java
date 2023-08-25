/** input: 16
 *  output: 16 = 3, 13
 *          16 = 5, 11
 * */

package com.phanidharsai.interviewquestions;

import java.util.HashMap;

public class CheckNumberIfSumOfPrime {
        // Method to Check Prime Number
        public static int check_prime(int num){
            int flag = 0;
            for(int i = 2; i<=num/2; i++){
                if(num%i == 0){
                    flag = 1;
                    return flag;
                }
            }
//            if(flag == 0)
//                return 0;
//            return 1;
            return flag;
        }
        // Method to get print the prime sum
        public static void find(int num){
//            HashMap<Integer,Integer> result= new HashMap<>();
            for(int i = 2; i <= num/2; i++) {
                if (check_prime(i) == 0) {
                    if (check_prime(num - i) == 0) {
//                        result.put(i, num - i);
                        System.out.println(num + " = " + i + ", " + (num - i));
                    }
                }
            }
        }
        public static void main(String[] args) {
            find(16);
        }
    }

