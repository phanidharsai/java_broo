package com.phanidharsai.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByAnyNum {
    public static void rotateByNum(int[] arr, int num) {
        num = num % arr.length;
        for (int i = num; i > 0; i--) {
            System.out.print(arr[arr.length - i]);
        }
        for (int j = 0; j < arr.length - num; j++) {
            System.out.print(arr[j]);
        }
    }
    public static void swap(int[] arr, int first, int second){
       int temp= arr[first];
       arr[first]=arr[second];
       arr[second]=temp;
    }
    /**
     * OWN LOGIC WITH SAME TIME COMPLEXITY AS REVERSE METHOD
     * **/
    public static void rotateInPlace(int[] arr, int num) {
        if(num>arr.length){
            num=num%arr.length;
        }
//        stepwise transformation of below logic if arr= 1,2,3,4 num=2
//        1st iteration -- 1,3,2,4  2nd -- 3,1,2,4  3rd -- 3,1,4,2   4th -- 3,4,1,2
//        looping the first for loop for num times in descending order
        for(int i=num;i>0;i-- ){
//            looping the second for loop from arr.length-num to num-i index
            for(int j=arr.length-i;j>num-i;j--){
                swap(arr, j,j-1);
            }
        }
    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateUsingReverse(int[] arr,int num){
        if(num>arr.length){
            num=num%arr.length;
        }
//        reversing the entire array
        reverse(arr,0,arr.length-1);
//       reversing the first num elements
        reverse(arr,0,num-1);
//        reversing the next set of elements
        reverse(arr,num,arr.length-1);
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
//        rotateByNum(arr,num);
//        rotateInPlace(arr,num);
        rotateUsingReverse(arr,num);
        System.out.println(Arrays.toString(arr));
    }
}
