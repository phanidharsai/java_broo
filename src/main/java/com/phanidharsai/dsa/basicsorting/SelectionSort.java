/**   **********************SELECTION SORT**************************
 *  step-1: Find the minimum index of the array
 *  step-2: Swap the positions of zeroth and minimum index
 *  step-3: Repeat step 1 and 2 by looping through the array each time finding the minimum index from the next
 *          set of elements in the sub-array like finding min index of 1 to last index and so on
 *  selection sort n(n+1)/2 steps to sort the entire array which gives O(n^2) as time complexity
 *                                                                              */

package com.phanidharsai.dsa.basicsorting;

import java.util.Arrays;

public class SelectionSort {
    static void swap(int[] array, int startIndex, int endIndex){
        int temp=array[startIndex];
        array[startIndex]=array[endIndex];
        array[endIndex]=temp;
        return;
    }
    static int minimumIndex(int[] array, int startIndex){
        int minIndex=startIndex;
        for(int i=startIndex+1;i<array.length;i++){
            if(array[i]<array[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }

    static int[] sortUsingSelectionSort(int[] array) {
        int j=0;
        while(j<array.length-1){     // here length-1 works bcoz when we find min index of last two elements last one would be greater anyways
            int minimumInd=minimumIndex(array,j);
            swap(array,j,minimumInd);
            j++;
        }
        return array;
    }
    public static void main(String[] args){
        int[] unSorted={69,142,16,111,42,15,299,234};
        System.out.println(Arrays.toString(sortUsingSelectionSort(unSorted)));
    }
}
