/** input: 6
    output:  * * * * * *
             * * * * *
             * * * *
             * * *
             * *
             *
 */

package com.phanidharsai.basicpatterns.starpatterns;

import java.util.Scanner;

public class InvertedRightTriangle2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=n;
        int spaces=0;
        while(i>0){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            i--;
            spaces+=2;
        }
    }
}
