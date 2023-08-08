//1
//3 4
//6 7 8
//10 11 12 13
//15 16 17 18 19

package com.phanidharsai.interviewquestions;

public class TrickyNumberPattern {
    public static void main(String[] args){
        int n=6;
        int s=1;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(j+i+s+" ");
//            }
//            System.out.println();
//            s=s+1+i;
//        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+i+s-2+" ");
            }
            System.out.println();
            s=s+i;
        }
    }
}
