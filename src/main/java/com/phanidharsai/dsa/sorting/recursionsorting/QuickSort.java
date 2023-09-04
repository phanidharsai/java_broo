 /**   ********************** QUICK SORT **************************
 *  step-1: Pick any element from the array, and call it pivot element
 *  step-2: now move all elements which are greater than pivot to the right and which are less to the left using
 *          left and right pointers
 *  step-2: repeat step 1 and 2 until
 *               worst case time complexity = O(n^2)
 *                              average is O(nlogn)               */

package com.phanidharsai.dsa.sorting.recursionsorting;

import java.util.Arrays;

public class QuickSort {
    static void swap(int[] array,int first,int second){
        int temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }
    public static int getPivotIndex(int[] arr, int firstInd, int lastInd){
//        int i= firstInd;
//        int j= lastInd;
//        int pivot=arr[firstInd];
//        while(i<j){
//            while( i<lastInd && arr[i]<=pivot  ){
//                i++;
//        }
//            while(j>firstInd && arr[j]>pivot ){
//                j--;
//            }
//            if(i<j){
//              swap(arr,i,j);
//            }
//        }
//          swap(arr, firstInd,j);
//        return j;
//  worst case scenario selecting least element as pivot everytime, approach
        int i= firstInd;
        int j= lastInd;
        int pivot =firstInd;
        for(int s=i;s<=j;s++){
            if(arr[s]<=arr[j]){
                swap(arr,s,j);
            }
        }
        swap(arr,j,pivot);
        return pivot;
    }
    public static void quickSort(int[] input,int low,int high){
        if(low<high){
            int pivotIndex= getPivotIndex(input,low, high);
            quickSort(input,low,pivotIndex-1);
            quickSort(input,pivotIndex+1,high);
        }
    }
    public static void main(String[] args){
        int[] initial={9,7,5,12,2, 14,3,10,6,5,2};
        int[] arr = {15, 69, 142, 16, 111, 16, 69, 42, 15, 199, 21};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
