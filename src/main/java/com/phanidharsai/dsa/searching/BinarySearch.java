/**   **********************Binary SEARCH**************************
 *  step-1: calculate the middle index, check the value of middle index and check if required number is less than or
 *  greater than required number, if required number is lesser than middle index value, call binary search again with low as
 *  0 and high as mid-1 else call with low as mid+1 and high as length-1
 *  return not found if low becomes greater than high
 *  Time complexity of binary search is O(log n), since it divides the collection into two halves for each iteration                                                              */

package com.phanidharsai.dsa.searching;

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
        System.out.println("Status: "+ binarySearch(sortedArray,0,sortedArray.length-1,0
        ));
        System.out.println(BinarySearch.count);
    }


}
