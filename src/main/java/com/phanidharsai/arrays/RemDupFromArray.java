package com.phanidharsai.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemDupFromArray {

    // works only for sorted array
    public static void removeDuplicates(int[] nums) {

        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        System.out.println(Arrays.toString(nums)); // printing entire array
        // printing unique elements only
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]<nums[j+1]){
                System.out.print(nums[j]+" ");
            }
            else{
                System.out.print(nums[j]);
                break;
            }
        }
        System.out.println();
    }

    public static void remDupUsingHashSet(int[] array){
        HashSet<Integer> unique= new HashSet<>();
        for(int i=0;i<array.length;i++){
            unique.add(array[i]);
        }
        System.out.println(unique);
    }
    public static void remDupUsingHashMap(int[] array){
        HashMap<Integer,Integer> noDup=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!(noDup.containsKey(array[i]))){
                noDup.put(array[i],1);
            }
            else{
                noDup.put(array[i],noDup.get(array[i])+1);
            }
        }
        System.out.println(noDup.keySet());
    }


    public static void main(String[] args){
        removeDuplicates(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5});
        remDupUsingHashSet(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5});
        remDupUsingHashMap(new int[]{0, 1, 0, 0, 1, 3, 2, 5, 3, 2, 3, 4, 1, 5});

    }
}
