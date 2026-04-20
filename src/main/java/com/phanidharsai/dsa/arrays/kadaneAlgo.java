/** largest sum of a subArray in an array
 * input: 5, -5, -6, -4, 2, 7, 9, -8
 * output: 18
 * */

package com.phanidharsai.dsa.arrays;

public class kadaneAlgo {
    public static void withFunction(int[] arr){
        int cS=0;
        int mS =arr[0];
        for(int i=0;i<arr.length;i++){
            cS = Math.max(arr[i],cS+arr[i]);
            mS = Math.max(cS,mS);
        }
        System.out.println(mS);
    }
    //compares current sum with current element if current element is more replace currentsum with current element
    public static void withoutFunction(int[] arr){
        int cS=0;
        int mS=arr[0];
        for(int i=0;i<arr.length;i++){
            cS+=arr[i];
            if(arr[i]>cS){
                cS=arr[i];
            }
            if(mS<cS){
                mS=cS;
            }
        }
        System.out.println(mS);
    }
    public static void main(String... args){
        int[] in={-5, 4, -2, -7, -2, 0, -9, -8};
        int cS=0;
        int mS=in[0];
        for(int i=0;i<in.length;i++){
            cS+=in[i];
            if(mS<cS){
                mS=cS;
            }
            if(cS<0){
                cS=0;
            }
        }
        System.out.println(mS);
        withFunction(in);
        withoutFunction(in);

    }
}
