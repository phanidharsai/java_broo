/**   ********************** INSERTION SORT **************************
 *  step-1: take a value starting from element at index 1
 *  step-2: compare the value of the element to the left of the value and place the value where it will be
 *          if the array from index 1 to zeroth index is sorted, continue this process for the rest of the elements
 *          in the sub-array moving right.
 *          it runs in O(n^2) time complexity (worst case)                                 */

package com.phanidharsai.dsa.basicsorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sortUsingInsertion(int[] array, int rightIndex, int value) {
        int j=rightIndex;
         // this loop is terminated when array[j]<=value or j<0 and the value at the time of comparision is carried to line no 19
            for(;j>=0 && array[j]>value;j--){
            array[j+1]=array[j];
        }
        System.out.println(j);
        array[j+1]=value;     // here j becomes -1 and exits the for loop, and executes this line
    }

//    1st approach naive
//    public static void sortUsingInsertion(int[] array, int rightIndex, int value) {
//        int j=rightIndex;
//        for(;j>=0;j--){
//            if(array[j]>value) {
//                array[j + 1] = array[j];
//                if(j==0){
//                    array[j]=value;
//                }
//            }
//            else if(array[j]<value){
//                array[j+1]=value;
//                return;
//            }
//        }
//    }

    public static void main(String[] args){
        int[] initial={69,142,16,111,42,15,199,21};
        for(int i=0;i<initial.length-1;i++){
            sortUsingInsertion(initial,i,initial[i+1]);
        }
        System.out.println(Arrays.toString(initial));
    }
}
