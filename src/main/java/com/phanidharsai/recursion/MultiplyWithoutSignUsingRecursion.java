package com.phanidharsai.recursion;

import java.util.Scanner;

public class MultiplyWithoutSignUsingRecursion {
    public static int MultiplyWithoutsignUsingRecu(int num1, int num2){
        if(num1==0||num2==0){
            return 0;
        }
        return num1+MultiplyWithoutsignUsingRecu(num1,num2-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(MultiplyWithoutsignUsingRecu(a,b));
    }
}
