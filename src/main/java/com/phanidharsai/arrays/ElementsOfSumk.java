/** input: 9
 *  output: 2,7
 * */
package com.phanidharsai.arrays;

import java.util.*;

public class ElementsOfSumk {
    public static void findArrayOfSum(int[] array, int sum){
//        for(int i=0; i<array.length;i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i] + array[j] == sum) {
//                    System.out.println(array[i] + ", " + array[j]);
////                    array[j]=0;    //use only when j also starts from 0
//                }
//            }
//        }
//        {1,3,2,7,9,4}
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            int diff = sum - array[i];
            if(map.containsKey(diff)){
                System.out.println( array[i]+ " "+ diff);
            }
            map.put(array[i], i);
        }
    }
    public static void findWithOneLoop(List input, int num){
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<input.size();i++){
            int n= (int)input.get(i);
            if(res.contains(num-n)){
                System.out.println( (num-n) +", "+ input.get(i));
            }
                res.add(n);
        }
//        System.out.println(res);
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,7,9,4};
        Scanner sc = new Scanner(System.in);
        int sum= sc.nextInt();
        findArrayOfSum(arr,sum);
//        findWithOneLoop(Arrays.asList(1,3,2,7,9,4),sum);
    }
}
