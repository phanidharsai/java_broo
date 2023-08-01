package com.phanidharsai.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ElementsOfSumk {
    public static void findArrayOfSum(int[] array, int sum){
        for(int i=0; i<array.length;i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println(array[i] + ", " + array[j]);
                    array[j]=0;
                }
            }
        }
    }
    public static void findWithOneLoop(List input, int num){
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<input.size();i++){
            int n= (int)input.get(i);
            if(res.contains(num-n)){
                System.out.println( (num-n) +", "+ input.get(i));
            }
            else{
                res.add(n);
            }
        }
//        System.out.println(res);
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,7,9,4};
        Scanner sc = new Scanner(System.in);
        int sum= sc.nextInt();
        findArrayOfSum(arr,sum);
        findWithOneLoop(Arrays.asList(1,3,2,7,9,4),sum);
    }
}
