package com.phanidharsai.recursion;
// output: 3
//         2
//         1
public class BasicBacktracking {
    public static void  basicBackTrackExamp(int i) {
        if(i>3){
            return;
        }
        basicBackTrackExamp(i+1);
        System.out.println(i); // if print statement was present before recursive call the op would be in increasing order
    }
    public static void main(String[] args){
        int n=1;
        basicBackTrackExamp(n);
    }
}


