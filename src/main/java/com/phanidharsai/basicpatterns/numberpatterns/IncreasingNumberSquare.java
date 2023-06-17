/** input: 6
    output: 1   1   1   1   1   1
            2   2   2   2   2   2
            3   3   3   3   3   3
            4   4   4   4   4   4
            5   5   5   5   5   5
            6   6   6   6   6   6
 * */

package com.phanidharsai.basicpatterns.numberpatterns;

import java.util.Scanner;

public class IncreasingNumberSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=1;
        while(j<=n) {
            for (int i = 1; i <= n; i++) {
                if(j<10) {
                    System.out.print(j + "   ");
                }
                else{
                    System.out.print(j+ "  ");
                }
            }
            System.out.println();
            j++;
        }
    }
}
