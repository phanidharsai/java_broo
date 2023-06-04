package com.phanidharsai.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccurenceOfWrdsInString {
    public static void main(String[] args){
        String input= "Congratulations Phanidhar sai you have been selected for the role of sde with 16 lpa and Congratulations Phanidhar sai";
        List<String> list= Arrays.asList(input.split(" "));
        Map<String,Long> map1= list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Long> map=Stream.of(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);
        String firstDup =list.stream()
                .filter(str-> Collections.frequency(list,str)>1)
                .findFirst()
                .get();
        System.out.println(firstDup);

    }
}
