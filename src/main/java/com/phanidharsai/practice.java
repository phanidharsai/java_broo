package com.phanidharsai;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class practice {
    public static void main(String[] args) {
//        int arr[]={5,8,2,1,6,9};
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                int temp=arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=temp;
//            }
//        }
////        System.out.println(Arrays.toString(arr));
//        Integer x =1;
//        Integer y =2;
//
//    System.out.println(x+y);
// TODO ..................
        String S = "[{(())}]";
        int[] array = new int[]{-1, 0, 1, 2 , 3, 4, 6, -2};
        int reqSum=4;

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0; i<array.length;i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == reqSum) {
                    System.out.println(array[i] + ", " + array[j]);
//                    array[j]=0;
                }
            }
        }
//        how to save entity with only required attributes
//    best practices for rest apis
//    shiva labs autoconfiguration internal implementation

    }
}
