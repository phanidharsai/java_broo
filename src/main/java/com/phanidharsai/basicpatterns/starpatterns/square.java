package com.phanidharsai.basicpatterns.numberpatterns.starpatterns;

import java.util.Scanner;

public class square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=n;
        while(i>0){
            int j=n;
            while(j>0){
                System.out.print("*  ");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
