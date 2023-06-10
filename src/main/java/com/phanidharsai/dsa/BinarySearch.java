/**   **********************Binary SORT**************************
 *  step-1: Move the maximum element to the last by adjacent comparision of two elements and swapping them
 *  step-2: Repeat step 1 for 0 to (j - 1) elements where j loops from last index to index 1
 *  Time complexity of binary search is O(log n)                                                              */

package com.phanidharsai.dsa;

public class BinarySearch {
    static int count=0;
    private static String binarySearch(int[] sA, int low, int high, int key) {
        count++;
        int mid=(low+high)/2;
        if(low>high){
            return "Notfound";
        }
        if(sA[mid]==key){
            return "Found at index " +mid;
        }
        if(sA[mid]<key){
            return binarySearch(sA,mid+1,high,key);
        }
        return binarySearch(sA,0,mid-1,key);


    }
    public static void main(String [] args){
        int[] sortedArray= {2, 5, 9, 13, 17, 21, 30,37,69,111,137};
        System.out.println("Satus: "+ binarySearch(sortedArray,0,sortedArray.length-1,137
        ));
        System.out.println(BinarySearch.count);
    }


}
