/** input: abcd
 *         cdabcdab
 *  output: 3
 *
 *  input: a
 *         aa
 *  output: 2
* */



package com.phanidharsai.dsa.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedStringMatch {
    public static int checkValid(String a, String b){
        Set<Character> charSet= new HashSet<>();
        for(char c :a.toCharArray()){
            charSet.add(c);
        }
        for(char d : b.toCharArray()){
            if(!charSet.contains(d)){
                return -1;
            }
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
