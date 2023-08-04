package com.phanidharsai.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciNum(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibonacciNum(n - 1) + fibonacciNum(n - 2);
        }
    }
    public static String fibonacciSeries(int n){
        String res="";
        for(int i=1;i<=n;i++){
            res+=fibonacciNum(i)+" ";
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciNum(n));
        System.out.println(fibonacciSeries(n));
    }
}
