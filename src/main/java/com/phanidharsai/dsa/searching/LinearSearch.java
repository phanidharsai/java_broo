/** Linear search traverses through the entire collection to find the required element
 *  Time complexity:
 *  Best:O(1)
 *  Worst: O(n), n is the size of collection
 *  input: 69
 *  output: found at index 8
 * */

package com.phanidharsai.dsa.searching;

import java.util.Scanner;

public class LinearSearch {
    public static String linearSearch(int[] input, int num){
        for(int i=0;i<input.length;i++){
            if(input[i]==num){
                return "found at index "+i;
            }
        }
        return "not found";
    }
    public static void main(String[] args){
        int[] array= {2, 5, 9, 13, 17, 21, 30,37,69,111,137};
        Scanner sc = new Scanner(System.in);
        int reqNum=sc.nextInt();
        System.out.println(linearSearch(array,reqNum));
        sc.close();
    }
}
