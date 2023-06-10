package com.phanidharsai.basicpatterns.numberpatterns;

import java.util.Scanner;

public class IncreasingNumberTriangle {
    static void increasingInSameLine(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
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
