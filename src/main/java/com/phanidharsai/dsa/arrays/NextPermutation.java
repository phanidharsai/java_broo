package com.phanidharsai.dsa.arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
    }
    public static void main(String[] args){
        int[] nums={1,2,3};
        nextPermutation(nums);
    }
}
