package com.phanidharsai.dsa.strings;

import java.util.Scanner;

public class RepeatedStringMatch {
    public static int checkValid(String a, String b){
        if(!(a.contains(b) || b.contains(a))){
            return -1;
        }
        int count =1;
        while(!(a.contains(b))){
            count++;
            a=a+a;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(checkValid(first,second));
    }
}
