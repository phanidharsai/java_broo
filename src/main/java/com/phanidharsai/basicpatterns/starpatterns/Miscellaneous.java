package com.phanidharsai.basicpatterns.starpatterns;

import java.util.Scanner;

public class Miscellaneous {
    static void starPyramid(int n) {
//  input : 6
//                  *
//                * * *
//              * * * * *
//            * * * * * * *
//          * * * * * * * * *
//         * * * * * * * * * * *

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n-i; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 2*(i-1); j++) {   // int j=1;j<=(2*i)+1 also works if i is started from 0
                System.out.print("* ");
            }
                System.out.println();
            }
        }

        static void reverseStarPyramid(int n){
//  input : 6
//        * * * * * * * * * * *
//          * * * * * * * * *
//            * * * * * * *
//              * * * * *
//                * * *
//                  *

            for(int i=1;i<=n;i++){
                for(int s=1;s<=i-1;s++){
                    System.out.print("  ");
                }
                for(int j=0;j<=2*(n-i);j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        static void starArrowHead(int n){
//  input:  6
//      *
//      * *
//      * * *
//      * * * *
//      * * * * *
//      * * * * * *
//      * * * * *
//      * * * *
//      * * *
//      * *
//      *

            for(int i=0;i<2*n;i++){
            if(i<n) {
                for (int j = 0; j <i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 0; j < 2 * n - i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void zeroesOnesTriangle(int n){
//  input: 6
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
//        0 1 0 1 0 1

        for(int i=0;i<n;i++){
            int t;
            if(i%2==0) {
                t = 1;
            }
            else {
                t = 0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(t + " ");
                t=1-t;
            }
            System.out.println();
        }
    }
    static void increasingNumberTriangle(int n){
//  input: 6
//        1         1
//        12       21
//        123     321
//        1234   4321
//        12345 54321
//        123456654321

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l=i;l>0;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    static void asceAlphaTriangle(int n){
//  input: 6
//        A
//        AB
//        ABC
//        ABCD
//        ABCDE
//        ABCDEF

        for(int i=0;i<n;i++){
            for(char j = 'A'; j<='A'+i; j++){
                System.out.print(j);
            }
             System.out.println();
            }
        }
        static void descAlphaTriangle(int n){
//  input: 6
//      ABCDEF
//      ABCDE
//      ABCD
//      ABC
//      AB
//      A
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+n-i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void asceAlphaTriangle2(int n){
//  input: 6
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE
//        FFFFFF

        for(int i=0;i<n;i++){
            char ch= (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void incralphAPyramid(int n){
//  input: 6
//        A
//        ABA
//        ABCBA
//        ABCDCBA
//        ABCDEDCBA
//        ABCDEFEDCBA

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int k=0;k<2*i+1;k++){
                System.out.print(ch);
                if(k<(2*i+1)/2){
                    ch = (char) (ch+1);
                }
                else{
                    ch= (char) (ch-1);
                }
            }
            System.out.println();
        }
    }
    static void decrAlphaPyramid(int n){
//  input:  6
//        F
//        EF
//        DEF
//        CDEF
//        BCDEF
//        ABCDEF

        for(int i=0;i<n;i++){
            char ch= (char) ('A'+n-1-i);
            for(int j=i+1 ; j>0; j--){
                System.out.print(ch);
                ch= (char) (ch+1);
            }
            System.out.println();
        }
    }
    static void decrSquareInSquare(int n){
//  output:  6
//        6 6 6 6 6 6 6 6 6 6 6
//        6 5 5 5 5 5 5 5 5 5 6
//        6 5 4 4 4 4 4 4 4 5 6
//        6 5 4 3 3 3 3 3 4 5 6
//        6 5 4 3 2 2 2 3 4 5 6
//        6 5 4 3 2 1 2 3 4 5 6
//        6 5 4 3 2 2 2 3 4 5 6
//        6 5 4 3 3 3 3 3 4 5 6
//        6 5 4 4 4 4 4 4 4 5 6
//        6 5 5 5 5 5 5 5 5 5 6
//        6 6 6 6 6 6 6 6 6 6 6

//        for(int i=1;i<=2*n-1;i++) {
//            for (int j = 1; j <= 2 * n - 1; j++) {
//                if (i == 1 || i == 2 * n -1 || j == 1 ||j==2*n-1){
//                    System.out.print(n+" ");
//                }
//                else if(i==2||i==2*n-2||j==2||j==2*n-2) {
//                    System.out.print(n - 1 + " ");
//                }
//                else if(i==3||i==2*n-3||j==3||j==2*n-3) {
//                    System.out.print(n - 2 + " ");
//                }
//                else{
//                    System.out.print(n-3+" ");
//                }
//            }
//            System.out.println();
//        }
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=2*n-2-j;
                int down=2*n-2-i;
                System.out.print(n-Math.min(Math.min(top,down),Math.min(left,right))+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        starPyramid(n);
//        reverseStarPyramid(n);
//        starArrowHead(n);
//        zeroesOnesTriangle(n);
//        increasingNumberTriangle(n);
//          asceAlphaTriangle(n);
//          descAlphaTriangle(n);
//          asceAlphaTriangle2(n);
//            incrAlphaPyramid(n);
//            decrAlphaPyramid(n);
//             hollowSquareDiamond(n);
                decrSquareInSquare(n);
    }

}
