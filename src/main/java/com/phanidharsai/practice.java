package com.phanidharsai;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practice {

    public static List<String> returnPallindromes(List<String> words){
        List<String> res = new ArrayList<>();
        for(String str:words){
            boolean isPal = true;
            for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)==str.charAt(str.length()-i-1)){
                    continue;
                }
                else{
                    isPal = false;
                }
            }
            if(isPal){
                res.add(str);
            }
        }
        return res;
    }
    public static int[] returnSortedArray(int[] a, int[] b) {
        int totalLen = a.length + b.length;
        int[] res = new int[totalLen];
        int index = 0;
        int left=0;
        int right=0;

    while(left<a.length && right<b.length) {
        if (a[left] <= b[right]) {
            res[index] = a[left];
            left++;
        } else {
            res[index] = b[right];
            right++;
        }
        index++;
    }
            while(right<b.length) {
                res[index] = b[right];
                right++;
                index++;
            }
            while(left<a.length) {
                res[index] = a[left];
                left++;
                index++;
            }
        return res;
    }
    public static void main(String[] args) {
// TODO ..................
//        String S = "[{(())}]";
//        how to save entity with only required attributes
//    best practices for rest apis
//    shiva labs autoconfiguration internal implementationclass Solution {
//        String[] array1= {"amazon","amazed","amaze","amazing","amazes"};
//        List<Integer> list=Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,1,3,3,3,2,2,2,2,2,2,2,5,5,60);
//        int maxDup= list.stream().max(Comparator.comparingInt(a->Collections.frequency(list,a))).get();
//        System.out.println(maxDup);
        List<String> names = new ArrayList<>(Arrays.asList("Alice"));
        List<String> pals = new ArrayList<>(Arrays.asList("madam","racecar","parent"));
        List<String> result = returnPallindromes(pals);
        System.out.println(result.toString()+" PHANI");
        int[] arr1 ={3,4,6,7,8,9};
        int[] arr2 = {1,5,10};
        int[] mergedArray = returnSortedArray(arr1,arr2);
        System.out.println(Arrays.toString(mergedArray)+" PHANI");
        Iterator<String> iterator= names.iterator();
        while(iterator.hasNext()){
            String name= iterator.next();
            System.out.println(name);
            if(name.equals("Alice")){
                iterator.remove();
            }
        }
        System.out.println(names.toString());
    }
}
