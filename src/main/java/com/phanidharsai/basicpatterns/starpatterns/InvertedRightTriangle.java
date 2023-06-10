package com.phanidharsai.basicpatterns.numberpatterns.starpatterns;

import java.util.Scanner;

public class InvertedRightTriangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i=n;
        int k=n;
        while(i>0){
            for(int j=k;j>0;j--) {
                System.out.print("* ");
            }
            System.out.println();
            i--;
            k--;
        }
    }
}
