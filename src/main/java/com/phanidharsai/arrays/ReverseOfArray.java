package com.phanidharsai.arrays;

import java.util.Arrays;
public class ReverseOfArray {
    public static void swap(int[] input, int f, int s){
        int temp= input[f];
        input[f]=input[s];
        input[s]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
