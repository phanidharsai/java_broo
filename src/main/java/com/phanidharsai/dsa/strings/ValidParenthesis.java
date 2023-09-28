package com.phanidharsai.dsa.strings;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    // for calculating the number of moves required to balance the string without using stack
    public static int calculateMoves(String input){
        int left=0;
        int right=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                left++;
            }
            else if(left>0){
                left--;
            }
            else{
                right++;
            }
        }
        return left+right;

    }
    // using stack

    public static int calculateUsingStack(String input){
        Stack<Character> temp= new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                 temp.push(input.charAt(i));
            }
            else{
                if(!temp.isEmpty()&&temp.peek()=='(') {
                    temp.pop();
                }
                else {
                    temp.push(input.charAt(i));
                }
            }
        }
        return temp.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(calculateMoves(in));
        System.out.println(calculateUsingStack(in));
    }
}
