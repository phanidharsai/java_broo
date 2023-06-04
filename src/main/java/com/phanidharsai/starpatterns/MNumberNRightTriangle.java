package com.phanidharsai.starpatterns;

import java.util.Scanner;

public class MNumberNRightTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        int i=m;
        while(i>0){
            String triangle="";
            int j=n;
            while(j>0){
                triangle="* "+triangle;
                System.out.println(triangle);
                j--;
            }
            i--;
        }
    }
}
