/*  print all subsequences in an array whose sum is equal to k, k=34 */

package com.phanidharsai.recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubSeqWithSumEqualToK {
    public static void getSubArrayWithSumK(int index, int[] input, List<Integer> out,int len,int sum,int reqsum){
        if(index==len){
            if(sum==reqsum) {
                System.out.println(out);
            }
            return;
        }
        out.add(input[index]);
        sum+=input[index];
        getSubArrayWithSumK(index+1,input, out,len,sum,reqsum);
        out.remove(out.size()-1);
        sum-=input[index];
        getSubArrayWithSumK(index+1,input, out,len,sum,reqsum);
    }
    public static void main(String[] args){
        int[] arr= {16,37,13,42,18,69,21};
        List<Integer> res=new ArrayList<>();
        int sum=0;
        getSubArrayWithSumK(0,arr,res,arr.length,sum,34);
    }
}
