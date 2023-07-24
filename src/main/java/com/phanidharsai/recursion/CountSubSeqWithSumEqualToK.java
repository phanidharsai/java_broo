/*  print count of subsequences in an array whose sum is equal to k, k=34*/

package com.phanidharsai.recursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubSeqWithSumEqualToK {
    public static int getCountSubSeqWithSumEqualToK(int index, int[] in,int len, int sum, int reqSum){
        if(index==len){
            if(sum==reqSum){
                return 1;
            }
            return 0;
        }
        sum+=in[index];
        int l = getCountSubSeqWithSumEqualToK(index+1,in,len,sum,reqSum);
        sum-=in[index];
        int r = getCountSubSeqWithSumEqualToK(index+1,in,len,sum,reqSum);
        return l+r;
    }
    public static void main(String[] args){
//        int[] arr= {16,37,13,42,18,69,21};
        int[] arr ={1,2,1,2,1,2,1,0,1,1,0};
//        int[] arr ={1,2};
        System.out.println(getCountSubSeqWithSumEqualToK(0,arr,arr.length,0,12));
    }
}
