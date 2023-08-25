/** input: 30
 *         50
 *  output: 19
 * */

package com.phanidharsai.interviewquestions;

import java.util.Scanner;

public class NonRepeatingDigits {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 =sc.nextInt();
        int count=n2-n1+1;
        for (int i=n1;i<=n2;i++){
            if(i>10){
                String nums=""+i;
                for(int j=0;j<nums.length()-1;j++){
                    if(nums.charAt(j)==nums.charAt(j+1)){
                        count--;
                    }
                }
            }
        }
        System.out.println(count);
        }
    }

