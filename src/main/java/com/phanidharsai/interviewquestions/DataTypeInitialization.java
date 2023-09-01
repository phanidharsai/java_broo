package com.phanidharsai.interviewquestions;

public class DataTypeInitialization {
//  public static void main(String... args){      // also works becoz of variable arguments introduction in 1.5 version of java
//  public static void main(String[]... args){    // also works for above mentioned reason
    public static void main(String[] args){
        int a =9;
//        int b =09;
// throws compilation error as 09 is interpreted as octal, since it is starting with zero and octal can only have digits in range 00 to 07
    }
}
