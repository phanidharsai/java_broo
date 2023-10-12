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
        public static void main(String[] args){
            String s = "abc";
            System.out.println(countDistinctSubstrings(s));
        }
    }
