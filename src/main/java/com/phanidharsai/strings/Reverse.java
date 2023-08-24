package com.phanidharsai.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reverse {
    public static String reverseWords(String input){
        String res="";
        if(!(input.isEmpty())) {
            String[] words = input.trim().split("\\s+"); // matches one or more white spaces and splits accordingly
//            System.out.println(Arrays.toString(words));
/**  input:          apple is a fruit
     output:          fruit a is apple
 */
            for(int i=words.length-1;i>=0;i--){
                res += words[i] + " ";
            }
        }
        return res.trim();
    }
    public static String reverseWordsAndChar(String input){
/** input:      apple is a fruit
    output:     tiurf a si elppa
 */
        String result="";
        if (!(input.isEmpty())) {
        /*  using for loop */
//            for (int i = input.length() - 1; i >= 0; i--) {
//                result = result + input.charAt(i);
//            }
//        /*  Using while */
//            int l = input.length();
//            while(l>0){
//                result = result+ input.charAt(l-1);
//                l--;
//            }
        /* using reverse method this is best */
            StringBuffer bufferWord = new StringBuffer(input);
             result = String.valueOf(bufferWord.reverse());
            result = new StringBuffer(input).reverse().toString();
        } else {
            System.out.println("String cannot be empty");
        }
        return result;
    }
    public static String reverseCharInWords(String input){
/** input:    apple is a fruit
    output:   elppa si a tiurf
* */
        String res="";
        if(!input.isEmpty()){
            String[] words= input.trim().split("\\s+");
            for(int i=0;i<words.length;i++){
                res= res + new StringBuffer(words[i]).reverse().toString()+" ";
            }
            return res.trim();
        }
        else{
            return "String cannot be empty";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        System.out.println(reverseWords(input));
//        System.out.println(reverseWordsAndChar(input));
//        System.out.println(reverseCharInWords(input));
//        using streams
        String res= Arrays.stream(input.split(" ")).map(a->new StringBuffer(a)).map(StringBuffer::reverse).collect(Collectors.joining(" "));
        String res2= Arrays.stream(input.split(" ")).sorted((i1,i2)-> -1).map(a->new StringBuffer(a)).map(StringBuffer::reverse).collect(Collectors.joining(" "));
        String res3= Arrays.stream(input.split(" ")).sorted((i1,i2)-> -1).collect(Collectors.joining(" "));
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
