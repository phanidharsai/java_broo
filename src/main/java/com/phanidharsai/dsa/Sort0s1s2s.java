/**     DUTCH NATIONAL FLAG ALGORITHM
 *
 * */

package com.phanidharsai.dsa;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void swap(int[] in,int first,int second){
        int temp= in[first];
        in[first]=in[second];
        in[second]=temp;
    }
    public static void main(String... args){
        int[] in={0,1,1,0,1,2,1,2,0,0,0};
        int low=0;
        int mid =0;
        int high=in.length-1;
        while(mid<=high){
            if(in[mid]==0){
                swap(in,low,mid);
                low++;
                mid++;
            }
            else if(in[mid]==1){
                mid++;
            }
            else if(in[mid]==2){
                swap(in,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(in));
    }
}
