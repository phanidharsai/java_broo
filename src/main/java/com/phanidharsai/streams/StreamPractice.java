package com.phanidharsai.streams;

import com.phanidharsai.streams.mapflatmap.Rider;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice
{
    public static void main( String[] args )
    {
        List<Integer> numbersList= Arrays.asList(1,7,8,9,5,2,36,4,78,222,24,9,2,29);
/*  stream for printing elements in list */
//    numbersList.stream().forEach(n->System.out.println(n));
//        numbersList.stream().forEach(System.out::println);

/* stream for printing unique elements of collection */
//        numbersList.stream().distinct().forEach(System.out::println);

/*  stream for printing duplicate elements in list*/
        HashSet<Integer> set =new HashSet<>();
        HashSet<Integer> set2 =new HashSet<>();
        numbersList.stream().filter(e->!set.add(e)).forEach(System.out::println);
        numbersList.stream().filter(e->!set2.add(e)).collect(Collectors.toSet()).forEach(System.out::println);

/* stream for printing first n elements of a collection */
        numbersList.stream().limit(1).forEach(System.out::println);

/*  stream api for sum of all elements in collection */
        Double  sum= numbersList.stream()
//                .mapToDouble(n->n.doubleValue())
                .mapToDouble(Double::valueOf)   // most recommended
//                .mapToDouble(n->n)            // not recommended
                .sum();
        System.out.println("my sum "+sum);
/* stream api for sum of first 5 elements*/
        Integer sumOf5 =  numbersList.stream().limit(5)
                .mapToInt(Integer::intValue)
                .sum();
//                .reduce((c,e)->(c+e)).get();
        System.out.println("sumOf5: "+sumOf5);

/*  stream api for calculating average of numbers in list */
        Double avgV1 = numbersList.stream()
                .mapToDouble(number->number.doubleValue())
                .average()
                .getAsDouble();
        System.out.println("avgV1:" +avgV1);

        Double avgV2 = numbersList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElseThrow();
        System.out.println(avgV2);

        /*  stream api for max and min */
        Integer maxNumberV1 = numbersList.stream()
                .mapToInt(Integer::valueOf)
            .max()
//          .min()
            .getAsInt();
        System.out.println("maxNumberv1: "+maxNumberV1);

        Integer maxNumberV2 = numbersList.stream()
            .max(Integer::compare)
//          .min()
            .get();
//        System.out.println("maxNumberV2: "+maxNumberV2);

        Integer maxNumberV3 = numbersList.stream()
//                .max(Comparator.comparing(Integer::valueOf))  // returns object, does not require autoboxing
                .max(Comparator.comparing(Integer::intValue)) // requires autoboxing as intValue() returns primitive
//          .min()
                .get();
        System.out.println("maxNumberV3: "+maxNumberV3);

        Integer maxNumberv4= numbersList.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics()
                .getMax();

/*  Stream api for sorting */
        List defOrder= numbersList.stream().sorted().toList(); // sorts according to natural sorting order
        List ascOrder= numbersList.stream().sorted(Comparator.naturalOrder()).toList();
        List descOrder= numbersList.stream().sorted(Comparator.reverseOrder()).toList();
        List custOrder= numbersList.stream().sorted(Comparator.comparing(n->n%10)).toList();
        List custOrder1=numbersList.stream().sorted((i,j)->i%10>j%10?1:i%10==j%10?0:-1).toList();
        List custOrder2=numbersList.stream().sorted((i,j)-> Integer.compare(i % 10, j % 10)).toList();
        System.out.println(defOrder);
        System.out.println(ascOrder);
        System.out.println(descOrder);
        System.out.println(custOrder);
        System.out.println(custOrder1);
        System.out.println(custOrder2);



/*  stream for finite data*/
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

// *********    Stream for generating OTP **************

        String otp= DoubleStream.generate(Math::random)
                .map(n->(n*100000))
                .map(Math::floor)
                        .mapToObj(Double::toString)
                .map(n->n.replace(".0",""))
                                .findFirst().orElse("try again");
        System.out.println(otp);

    }
}
