package com.phanidharsai.recursion;

//public class Factorial {
//    public static int factorial(int n){
//        if(n==1 || n==0){
//             return 1;
//        }
//        return n*factorial(n-1);
//    }
//    public static void main(String[] args){
//        int n=16;
//        System.out.println(factorial(n));
//    }
//}


// parameterised way

public class Factorial{
    public static void factorial(int n , int product){
        if(n<1){
            System.out.println(product);
            return;
        }
        factorial(n-1,product*n);
    }
    public static void main(String[] args){
        int n=16;
        factorial(n,1);
    }
}
