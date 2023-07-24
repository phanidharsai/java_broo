package com.phanidharsai.recursion;

public class IsPalindrome {
    public static boolean isPalindrome(String input,int index, int len){
        if(index==len/2){
            return true;
        }
        if(input.charAt(index)!=input.charAt(len-1-index)){
            return false;
        }
        return isPalindrome(input,index+1,len);
    }
    public static String reverse(String str, int index, int len){
        if(index > len-1){
            return "";
        }
        String res= reverse(str,index+1,len);
        return res+str.charAt(index);
    }
    public static void main (String[] args){
        String str= "iasai";
        int i=0;
        System.out.println(isPalindrome(str,i,str.length()));
        System.out.println(reverse(str,i,str.length()));
    }
}
