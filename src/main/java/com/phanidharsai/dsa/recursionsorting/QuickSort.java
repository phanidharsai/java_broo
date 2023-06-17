/**   ********************** QUICK SORT **************************
 *  step-1: Pick any element from the array, and call it pivot element
 *  step-2: now move all elements which are greater than pivot to the right and which are less to the left using
 *          left and right pointers
 *  step-2: repeat step 1 and 2 until
 *                                                                */

package com.phanidharsai.dsa.recursionsorting;

import java.util.Arrays;

public class QuickSort {
    static void swap(int[] array,int first,int second){
        int temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }
    public static int getPivotIndex(int[] arr, int firstInd, int lastInd){
        int i= firstInd;
        int j= lastInd;
        int pivot=arr[firstInd];
        while(i<j){
            while(arr[i]<=pivot&& i<=lastInd-1){
                i++;
        }
            while(arr[j]>pivot && j>=firstInd-1){
                j--;
            }
            if(i<j){
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
            }
        }
        int temp2=arr[firstInd];
        arr[firstInd]=arr[j];
        arr[j]=temp2;
        return j;
//  A bit advanced approach
//        for(int s=pivot;s<=j;s++){
//            if(arr[s]<=arr[j]){
////                System.out.println(arr[s]+" "+arr[j]);
//                swap(arr,s,j);
////                System.out.println(arr[s]+" "+arr[j]);
//            }
//        }
//        swap(arr,j,pivot);
////        System.out.println(arr[j]+" "+arr[pivot] +"p");
//        return pivot;
    }
    public static void quickSort(int[] input,int low,int high){
        if(low<high){
            int pivotIndex= getPivotIndex(input,low, high);
            quickSort(input,low,pivotIndex-1);
            quickSort(input,pivotIndex+1,high);
        }
    }
    public static void main(String[] args){
        int[] initial={9,7,5,12,2,14,3,10,6,5,2};
        quickSort(initial,0,initial.length-1);
        System.out.println(Arrays.toString(initial));
    }
}
