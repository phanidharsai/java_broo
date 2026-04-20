//input: "abcabcdab"
//output: 4
//        (abcd or bcda or cdab)

package com.phanidharsai.dsa.strings.sliding_window;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class LongestSubString {

//    best for characters outside ASCII range like currencies, emojis
//    public static int lengthOfLongestSubstringUsingMap(String s) {
//        int n = s.length();
//        int max = 0;
//        int left = 0;
//        Map<Character, Integer> charMap = new HashMap<>();
//        for(int right=0; right<n;right++){
//            if(!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right))<left){
//                charMap.put(s.charAt(right),right);
//                max = Math.max(max, right-left+1);
//            }
//            else {
//                left = charMap.get(s.charAt(right)) + 1;
//                charMap.put(s.charAt(right), right);
//            }
//        }
//        return max;
//    }
        public static int lengthOfLongestSubstringUsingMap(String s) {
            int max = 0;
            int left = 0;
            Map<Character, Integer> charMap = new HashMap<>();

            for (int right = 0; right < s.length(); right++) {
                char ch = s.charAt(right);

                if (charMap.containsKey(ch) && charMap.get(ch) >= left) {
                    left = charMap.get(ch) + 1;
                }

                charMap.put(ch, right);
                max = Math.max(max, right - left + 1);
            }

            return max;
        }
//    for characters in ASCII range
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        int max =0;
        int left =0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        for(int right=0;right<n;right++){
            if(charIndex[s.charAt(right)]>=left){
                left= charIndex[s.charAt(right)]+1;
            }
                charIndex[s.charAt(right)]=right;
                max = Math.max(max, right-left+1);

        }
        return max;
    }

    public static void main(String[] args){
        String s= "pwwkew";
        int max = lengthOfLongestSubstringUsingMap(s);
        System.out.println(max);
    }
}