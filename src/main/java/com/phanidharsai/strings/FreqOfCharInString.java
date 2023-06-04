package com.phanidharsai.strings;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FreqOfCharInString{
    //without using map
    public static void FreqOfCharWithoutUsingMap(String s) {
        String s1 = s;
        char[] string = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            int value = 1;
            for (int j = i + 1; j < s1.length(); j++) {
                if (string[i] == string[j]) {
                    value = value + 1;
                    string[j] = '0';
                }
            }
            if (!((string[i]) == '0')) {
                System.out.println("count of " + string[i] + " is " + value);
            }
        }
    }

// using map
    public static void FreqOfCharUsingMap(String s) {
        int value = 1;
        String s2 = s;
        TreeMap<Character, Integer> m1 = new TreeMap<>();
        HashMap<Character, Integer> h1= new HashMap<>(m1);
        for (int i = 0; i < s2.length(); i++) {
            if (m1.containsKey(s2.charAt(i))) {
                m1.put(s2.charAt(i), value + 1);
            } else {
                m1.put(s2.charAt(i), value);
            }
        }
        System.out.println(m1);
        List<Character> unique= h1.entrySet().stream().filter(v->v.getValue()==1).map(k->k.getKey()).collect(Collectors.toList());
    }


public static void main(String[] args) {
            // TODO Auto-generated method stub
            FreqOfCharWithoutUsingMap("Phanidharsai");
            FreqOfCharUsingMap("Phanidharsai");
            }
}



