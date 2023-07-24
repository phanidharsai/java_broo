package com.phanidharsai.arrays;

import java.util.Scanner;

public class RotateArrayByAnyNum {
    public static void rotateByNum(int[] arr, int num){
        num=num%arr.length;
        for(int i=num;i>0;i--){
            System.out.print(arr[arr.length-i]);
        }
        for(int j=0;j<arr.length-num;j++){
            System.out.print(arr[j]);
        }
//        int res[] = new int[arr.length];
//        int j=0;
//        for(int i=num;i>0;i--){
//            res[j]=arr[arr.length-i];
//            j++;
//        }
//        for(int k=nu)
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        rotateByNum(arr,num);
    }
}
