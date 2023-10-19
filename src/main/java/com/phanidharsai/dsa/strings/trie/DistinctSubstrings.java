package com.phanidharsai.dsa.strings.trie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctSubstrings {
        public static int countDistinctSubstrings(String s)
        {
            Set<Character> charSet= new HashSet<>();
            for(int i=0; i<s.length();i++){
                charSet.add(s.charAt(i));
            }
            int len= charSet.size();
            if(len==s.length()){
                return 1+(len*(len+1))/2;
            }
            else{
                Set<String> res= new HashSet<>();
                for(int i=0;i<=s.length();i++){
                    for(int j=i+1;j<=s.length();j++){
                            res.add(s.substring(i,j));
//                            System.out.println(res);
                    }
                }
                return res.size()+1;
            }
        }
        public static void main(String[] args){
            String s = "abc";
            System.out.println(countDistinctSubstrings(s));

        }
    }
