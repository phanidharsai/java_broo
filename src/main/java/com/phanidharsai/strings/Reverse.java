package com.phanidharsai.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static String reverseWords(String input){
        String res="";
        if(!(input.isEmpty())) {
            String[] words = input.trim().split(" ");
            System.out.println(Arrays.toString(words));
            for(int i=words.length-1;i>=0;i--){
                res+=words[i]+" ";
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        String result="";
        if (!(word.isEmpty())) {
/*  using for loop */
//            for (int i = word.length() - 1; i >= 0; i--) {
//                result = result + word.charAt(i);
//            }
/*  Using while */
//            int l = word.length();
//            while(l>0){
//                result = result+ word.charAt(l-1);
//                l--;
//            }
/* using reverse method this is best */
//            StringBuffer bufferWord = new StringBuffer(word);
//             result = String.valueOf(bufferWord.reverse());
            result = new StringBuffer(word).reverse().toString();
        } else
            System.out.println("String cannot be empty");

        System.out.println(result);
        sc.nextLine();
        String input = sc.nextLine();
        System.out.println(reverseWords(input));
    }
}
