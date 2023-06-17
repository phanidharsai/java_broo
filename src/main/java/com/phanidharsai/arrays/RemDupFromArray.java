package com.phanidharsai.arrays;

import java.util.Arrays;

public class RemDupFromArray {
    public static void removeDuplicates(int[] nums) {

        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]<nums[j+1]){
                System.out.print(nums[j]+" ");
            }
            else{
                System.out.print(nums[j]);
                break;
            }
        }
    }
    public static void main(String[] args){
        RemDupFromArray
                        .removeDuplicates(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5});

    }
}
