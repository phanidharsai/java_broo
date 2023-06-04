package com.phanidharsai.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
    public static void main(String[] args){
        Integer[] array={6,2,4,10};
        Integer secondlargest= Arrays.stream(array).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(secondlargest);

    }
}
