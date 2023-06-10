/**   **********************BUBBLE SORT**************************
 *  step-1: Move the maximum element to the last by adjacent comparision of two elements and swapping them
 *  step-2: Repeat step 1 for 0 to (j - 1) elements where j loops from last index to index 1
 *                                                                */
 package com.phanidharsai.dsa.basicsorting;

import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    public static void bubbleSort(int[] input, int len){
        boolean didSwap=false;
        int j=len-1;
        while(j>0){
            for(int i=0;i<j;i++){
                if(input[i]>input[i+1]){
                    swap(input,i,i+1);
                    didSwap=true;
                }
            }
            if(!didSwap){
                break;
            }
            j--;
        }
    }
    public static void main(String[] args){
        int[] initial={69,142,16,111,42,15,15,199};
        bubbleSort(initial,initial.length-1);
        System.out.println(Arrays.toString(initial));

    }
}
