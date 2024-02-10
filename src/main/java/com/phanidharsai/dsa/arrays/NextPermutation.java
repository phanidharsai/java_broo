package com.phanidharsai.dsa.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void swap(int[] in, int a, int b) {
        int temp = in[a];
        in[a] = in[b];
        in[b] = temp;
    }

    public static void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        System.out.println(ind);
        for (int j = n - 1; j > ind; j--) {
            if (nums[j] > nums[ind]) {
                swap(nums, ind, j);
                break;
            }
        }
            int l = 1;
            for (int k = ind + 1; k <= (ind + nums.length) / 2; k++) {
                swap(nums, k, nums.length - l);
                l++;
                System.out.println(Arrays.toString(nums));
            }

            System.out.println(Arrays.toString(nums));
        }
        public static void main (String[] args){
        int[] nums={1,0,7,6,4,3,2};
//            int[] nums = {1, 3, 2};
            nextPermutation(nums);

        }
    }
