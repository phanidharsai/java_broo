package com.phanidharsai.dsa;

public class BinarySearch {
    private static String binarySearch(int[] sA, int low, int high, int key) {
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
        int[] sortedArray= {2, 5, 9, 13, 17, 21, 30};
        System.out.println("Satus: "+ binarySearch(sortedArray,0,sortedArray.length-1,30));
    }


}
