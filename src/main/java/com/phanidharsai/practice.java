package com.phanidharsai;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practice {
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
