/**  Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 *   or -1 if needle is not part of haystack.
 *  input: sadbutsad
           sad
    output: 0
    input: leetcode
           leeto
    output: -1
 * */

package com.phanidharsai.dsa.strings;

import java.util.Scanner;

public class IndexOfFirstOccurrence {
    public static int findIndex(String haystack, String needle) {
        int lenOfNeedle=needle.length();
        if(!haystack.contains(needle)){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+lenOfNeedle).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String haystack= sc.nextLine();
        String needle= sc.nextLine();
        System.out.println(haystack.substring(6,9));
        System.out.println(findIndex(haystack,needle));
    }
}
