package com.phanidharsai.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubArraySeq {
    public static void printAllSubSeq(int index, int[] initial, List<Integer> in, int len){
        if(index==len){
            System.out.println(in);
            return;
        }
        in.add(initial[index]);
        printAllSubSeq(index+1,initial,in,len);
        in.remove(in.size()-1);
        printAllSubSeq(index+1,initial,in,len);
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        List<Integer> in= new ArrayList<Integer>();
        printAllSubSeq(0,arr,in,arr.length);
    }
}
