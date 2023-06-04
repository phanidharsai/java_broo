package com.phanidharsai.interviewquestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodeRefactoringToJava8 {
    public static void main(String[] args){
        System.out.println(isPrime(6));
/*  before java 8*/
//        List<Double> sqrtOf10Prime= new ArrayList<Double>(10);
//        int index=1;
//        while(sqrtOf10Prime.size()<10){
//            if(isPrime(index)){
//                sqrtOf10Prime.add(Math.sqrt(index));
//            }
//            index++;
//        }

/*  using java 8*/
        List<Double> sqrtOf10Prime= Stream.iterate(1,i->i+1)
                .filter(CodeRefactoringToJava8::isPrime)
                .limit(10)
                .peek(System.out::println)
                .map(Math::sqrt)
                .collect(Collectors.toList());
        System.out.println(sqrtOf10Prime);
    }

    private static boolean isPrime(int number) {
//        boolean isDivisible=false;
//        for(int i=2;i<number;i++){
//            if(number%i==0){
//                isDivisible=true;
//                break;
//            }
//        }
//          return number>1 && !isDivisible;
/*  in java8 */
        return number>1 && IntStream.range(2,number) //stream of values from 2 to number
//                .noneMatch(n->number%n==0); // returns true if number is not divisible by any other
                                    .allMatch(n->number%n!=0); // checks if it is not divisible by any number
    }
}
