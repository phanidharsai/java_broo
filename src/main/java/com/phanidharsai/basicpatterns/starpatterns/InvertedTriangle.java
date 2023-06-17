/** input: 6
    output:  * * * * *
             * * * *
             * * *
             * *
             *
 */

package com.phanidharsai.basicpatterns.starpatterns;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=n;
        int spaces=0;
        while(i>0){
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces+=1;
            i--;
        }
    }
}
