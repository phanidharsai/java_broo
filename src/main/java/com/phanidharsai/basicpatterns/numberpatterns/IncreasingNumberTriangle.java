package com.phanidharsai.basicpatterns.numberpatterns;

import java.util.Scanner;

public class IncreasingNumberTriangle {

    /** input: 6
        output:  1
                 1 2
                 1 2 3
                 1 2 3 4
                 1 2 3 4 5
                 1 2 3 4 5 6
     */
    static void increasingInSameLine(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /** input: 6
        output:  1
                 2  2
                 3  3  3
                 4  4  4  4
                 5  5  5  5  5
                 6  6  6  6  6  6
     */
    static void increasingInNextLine(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        increasingInSameLine(n);
        increasingInNextLine(n);
    }
}
