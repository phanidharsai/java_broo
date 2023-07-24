package com.phanidharsai.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
    public static void findSecondLargest(Integer[] array){
        int largest=array[0];
        int secondLargest=array[1];
        for(int i=1;i<array.length;i++){
            if (array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            }
        }
        System.out.println(secondLargest);
    }
    public static void main(String[] args){
        Integer[] array={6,2,4,1,5,7,9,10,16,1,3,21};
        Integer secondlargest= Arrays.stream(array)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElseThrow();
        Integer secondlargest2= Arrays.stream(array)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .max(Integer::compareTo).get();
        System.out.println(secondlargest);
        System.out.println(secondlargest2);
        findSecondLargest(array);

    }
}
