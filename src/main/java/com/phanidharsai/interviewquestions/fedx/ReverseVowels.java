//input: helloo
//output: holloe
// output should have vowels in reverse order i.e eoo as ooe
package com.phanidharsai.interviewquestions.fedx;

import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
    public static void swap(char[] in, int start, int end){
        char temp= in[start];
        in[start]=in[end];
        in[end]=temp;
    }

    public static void main(String[] args){
        String in = "hellooau";
        int start=0;
        int end=in.length()-1;
        List<Character> vow = Arrays.asList('a','e','i','o','u');
        char[] str = in.toCharArray();
        while(start<end){
            while(!(vow.contains(in.charAt(start)))){
                start++;
            }
            while(!(vow.contains(in.charAt(end)))){
                end--;
            }
            swap(str,start,end);
            System.out.println(start+" "+end);
            start++;
            end--;
        }
        for(int i=0;i<str.length;i++) {
            System.out.print(str[i]);
        }
    }
}
