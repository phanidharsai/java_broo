package com.phanidharsai.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubArraySeq {
    public static void printAllSubSeq(int index, int[] initial, List<Integer> out, int len){
        if(index==len){
            System.out.println(out);
            return;
        }
        out.add(initial[index]);
        printAllSubSeq(index+1,initial,out,len);
        out.remove(out.size()-1);
        printAllSubSeq(index+1,initial,out,len);
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        List<Integer> res= new ArrayList<Integer>();
        printAllSubSeq(0,arr,res,arr.length);
    }
}
