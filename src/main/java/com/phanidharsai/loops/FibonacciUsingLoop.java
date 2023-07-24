package com.phanidharsai.loops;

import java.util.Scanner;

public class FibonacciUsingLoop {
    private static String fibonacciSeries(int x) {
        String res="";
        int first=0, second =1, fibonacci=0;
        for(int i=0;i<x;i++){
            if(i<=1){
                fibonacci=i;
                res+=fibonacci+" ";
            }
            else{
                fibonacci=first+second;
                first=second;
                second=fibonacci;
                res+=String.valueOf(fibonacci)+" ";
            }
        }
        return res;
    }
    private static int fibonacciNum(int x) {
        int first=0, second =1, fibonacci=0;
        for(int i=0;i<x;i++){
            if(i<1){
                fibonacci=i;
            }
            else{
                first=second;
                second=fibonacci;
               fibonacci=first+second;
            }
        }
        return fibonacci;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fibonacciSeries(x));
        System.out.println(fibonacciNum(x));
    }
}
