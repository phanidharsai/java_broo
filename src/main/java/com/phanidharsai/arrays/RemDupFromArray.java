package com.phanidharsai.arrays;

import java.util.Arrays;

public class RemDupFromArray {
    public static int[] removeDuplicates(int[] nums) {

        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                nums[i+1]=0;
                addIndex++;
//                System.out.println(Arrays.toString(nums));
            }
        }
        return nums;
    }
    public static void main(String[] args){
        System.out.println(Arrays
                .toString(RemDupFromArray
                        .removeDuplicates(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5})));

    }
}
