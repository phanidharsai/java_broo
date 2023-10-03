/** input: abcd
 *         cdabcdab
 *  output: 3
 *
 *  input: a
 *         aa
 *  output: 2
 *
 *  input: aaaaaaaaaaaaaaaaaaaaaab
 *          ba
 *  output: 2
 *
 *  input: abcabcabcabc
 *         abac
 *  output: -1
 *
 *  input: abc
 *         cabcabca
 *  output: 4
 *
 *  input: aaaaaaaaaaaaaaaaaaaaaab
 *         ba
* */



package com.phanidharsai.dsa.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedStringMatch {
    public static int checkValid(String a, String b){
        int first=a.length();
        int second= b.length();
        int minMultiplier=2;

        if(first>second){
            minMultiplier=first/second;
            if(first%second!=0){
                minMultiplier=minMultiplier+first%second;
            }
        }
        else{
            minMultiplier=second/first;
            if(second%first!=0){
                minMultiplier=minMultiplier+second%first;
            }
        }

        Set<Character> charSet= new HashSet<>();
        for(char c :a.toCharArray()){
            charSet.add(c);
        }
        for(char d : b.toCharArray()){
            if(!charSet.contains(d)){
                System.out.println("123");
                return -1;
            }
        }
        int count =0;
        String temp="";
        while(!temp.contains(b)){
            if(temp.length()>minMultiplier* b.length()){
                return -1;
            }
            count++;
            temp=temp+a;
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
