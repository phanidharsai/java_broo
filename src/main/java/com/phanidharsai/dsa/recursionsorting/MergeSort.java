/**   ********************** MERGE SORT **************************
 *  step-1: Divide the array into two n/2 sub arrays where n is length of array and continue to do using recursion,
 *          ultimately reaching to a single element sub array
 *  step-2: while merging using backtracking insert the elements in sorted order which inturn gives one complete sorted
 *          array. (USES DIVIDE AND CONQUER method)
 *                                                                */

package com.phanidharsai.dsa.recursionsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void implementMerge(int[] arr,int firstInd,int midInd,int lastInd){
//        ****  MERGING BY CREATING A NEW LIST *******
//        int leftPointer=firstInd;
//        int rightPointer=midInd+1;
//        List<Integer> temp=new ArrayList<>();
//        while(leftPointer<=midInd && rightPointer<=lastInd){
//            if(arr[leftPointer]<=arr[rightPointer]){
//                temp.add(arr[leftPointer]);
//                leftPointer++;
//            }
//            else{
//                temp.add(arr[rightPointer]);
//                rightPointer++;
//            }
//        }
//        while(leftPointer<=midInd){
//            temp.add(arr[leftPointer]);
//            leftPointer++;
//        }
//        while(rightPointer<=lastInd){
//            temp.add(arr[rightPointer]);
//            rightPointer++;
//        }
//        for(int i=firstInd;i<=lastInd;i++){
//            arr[i]= temp.get(i-firstInd);
//        }

//   **********     MERGING BY CREATING AN ARRAY **********
        int i=0;
        int j=0;
        int lenOfFirstArr=midInd-firstInd+1;
        int lenOfSecondArr=lastInd-midInd;
        int L[]=new int[lenOfFirstArr];
        int R[]=new int[lenOfSecondArr];
        for(i=0;i<lenOfFirstArr;i++){
            L[i]=arr[firstInd+i];
        }
        for(j=0;j<lenOfSecondArr;j++){
            R[j]=arr[midInd+1+j];
        }
        int k=firstInd; i=0;j=0;
        while(i<lenOfFirstArr && j<lenOfSecondArr){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<lenOfFirstArr){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<lenOfSecondArr){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public static void sortUsingMerge(int[] in, int low, int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        sortUsingMerge(in,low,mid);
        sortUsingMerge(in,mid+1,high);
        implementMerge(in,low,mid,high);
    }

    public static void main(String[] args){
        int[] initial={69,15,142,16,111,42,15,199};
        sortUsingMerge(initial,0,initial.length-1);
        System.out.println(Arrays.toString(initial));
    }
}
