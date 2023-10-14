package com.phanidharsai.dsa.strings.trie;

import java.util.ArrayList;
import java.util.List;

public class DistinctSubstrings {
        public static int countDistinctSubstrings(String s)
        {
            //	  Write your code here.
            List<String> res= new ArrayList<>();
            for(int i=0;i<=s.length();i++){
                for(int j=i+1;j<=s.length();j++){
                    if(!res.contains( s.substring(i,j))){
                        res.add(s.substring(i,j));
                        System.out.println(res);
                    }
                }
            }
            return res.size()+1;
        }
        public static void getSol(char[] arr, int index, int len, List<Character> temp){
            if(index==len){
                return;
            }
            temp.add(arr[index]);
            getDistinctSubstrings(arr,index+1,len,temp);
            temp.remove(temp.size()-1);
            getDistinctSubstrings(arr,index+1,len,temp);
        }
        public static int getDistinctSubstrings(char[] arr, int index, int len, List<Character> temp){
            getSol(arr,index,len,temp);
            return temp.size()+1;
        }
        public static void main(String[] args){
            String s = "abc";
            char[] arr= s.toCharArray();
            List<Character> temp = new ArrayList<>();
            int len = s.length();
//            System.out.println(countDistinctSubstrings(s));
            System.out.println(getDistinctSubstrings(arr,0,len,temp));
        }
    }
