/*  print any subsequence in an array whose sum is equal to k, k=34*/

package com.phanidharsai.recursion;

import java.util.ArrayList;
import java.util.List;

public class AnySubSeqWithSumEqualToK {
    public static boolean getAnySubArrayWithSumK(int index,int[] in,List<Integer> res,int len,int sum,int reqSum){
        if(index==len){
            if(sum==reqSum){
                System.out.println(res);
                return true;
            }
            else return false;
        }
        res.add(in[index]);
        sum+=in[index];
        if(getAnySubArrayWithSumK(index+1,in,res,len,sum,reqSum)==true){
            return true;
        }
        sum-=in[index];
        res.remove(res.size()-1);
        if(getAnySubArrayWithSumK(index+1,in,res,len,sum,reqSum)==true){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr= {16,37,13,42,18,69,21};
        List<Integer> res=new ArrayList<>();
        int sum=0;
        getAnySubArrayWithSumK(0,arr,res,arr.length,sum,34);
    }
}
