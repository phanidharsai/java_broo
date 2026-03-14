package com.phanidharsai.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestPalindrome {
    public static String getLongestPalindrome(String input){
         List<String> allSubString=new ArrayList<>();
         allSubString=getAllSubString(input,0,input.length(), allSubString);
         System.out.println(allSubString);
        return "ok";
    }
    public static List<String> getAllSubString(String input, int firstIndex, int lastIndex,List<String> res){
        if(firstIndex>=lastIndex){
            return res;
        }
        res.add(input.substring(firstIndex,lastIndex));
        getAllSubString(input,firstIndex+1,lastIndex,res);

        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(!(input.isEmpty())) {
            System.out.println(getLongestPalindrome(input));
        }
    }
}
