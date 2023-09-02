package com.phanidharsai.dsa.searching;

public class LinearSearch {
    public static String linearSearch(int[] input, int num){
        for(int i=0;i<input.length;i++){
            if(input[i]==num){
                return "found at index "+i;
            }
        }
        return "not found";
    }
    public static void main(String[] args){
        int[] array= {2, 5, 9, 13, 17, 21, 30,37,69,111,137};
        System.out.println(linearSearch(array,69));

    }
}
