package com.phanidharsai;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practice {
    public static void main(String[] args) {
//        int arr[]={5,8,2,1,6,9};
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                int temp=arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=temp;
//            }
//        }
////        System.out.println(Arrays.toString(arr));
//        Integer x =1;
//        Integer y =2;
//
//    System.out.println(x+y);
// TODO ..................
//        String S = "[{(())}]";
//        int[] array = new int[]{-1, 0, 1, 2 , 3, 4, 6, -2};
//        int reqSum=4;
//
//        HashMap<Integer,Integer> map= new HashMap<>();
//
//        for(int i=0; i<array.length;i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i] + array[j] == reqSum) {
//                    System.out.println(array[i] + ", " + array[j]);
////                    array[j]=0;
//                }
//            }
//        }
//        how to save entity with only required attributes
//    best practices for rest apis
//    shiva labs autoconfiguration internal implementationclass Solution {

        int[] array={1,1,1,3,3,3,2,2,2,2,2,2,2,5,5,6};
        String text = "Welcome to javaaaaa world";
        String[] strings=text.split(" ");
        String[] array1= {"amazon","amazed","amaze","amazing","amazes"};
        String subtext= Arrays.stream(array1)
                .reduce((str1,str2)->str1.substring(0, IntStream.range(0,Math.min(str1.length(),str2.length()))
                        .filter(i->str1.charAt(i)!=str2.charAt(i)).findFirst().orElse(Math.min(str1.length(),str2.length()))))
                        .orElse("no");
        System.out.println(subtext);

//        System.out.println(longword);
        List<Integer> arr = Arrays.asList(1,1,1,3,3,3,2,2,2,2,2,2,2,5,5,6);
        int num=arr.stream().collect(Collectors.groupingBy(a->a,Collectors.counting())).entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
        int num2= arr.stream().distinct().max(Comparator.comparingInt(a->Collections.frequency(arr,a))).get();

    }
}
