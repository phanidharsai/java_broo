//Input : n = 2
//        Output : 9009
//        9009 is the largest number which is product of two
//        2-digit numbers. 9009 = 91*99.
//
//        Input : n = 3
//        Output : 906609

package com.phanidharsai.interviewquestions;

public class MaxPalindromeOfProductOfTwoNumbersInAGivenRange {
    public static boolean palindrome(int num){
        String input= num+"";
        String res= new StringBuffer(input).reverse().toString();
        if(res.equals(input)){
            return true;
        }
        return false;

    }
    public static int getStart(int num){
        String res="1";
        for(int i=0;i<num-1;i++){
            res+="0";
        }
        return Integer.parseInt(res);
    }
    public static int getEnd(int num){
        String res="";
        for(int i=0;i<num;i++){
            res+="9";
        }
        return Integer.parseInt(res);
    }
    public static void main(String[] args) {
        int n =3 ;
//        int start=10;
//        int end = 99;
        int start=getStart(n);
        int end=getEnd(n);
        int max=0;
        for(int i=start;i<=end;i++){
            for(int j=start;j<=end;j++){
                if(palindrome(i*j)){
                    if(i*j>max){
                        max=i*j;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
