package com.phanidharsai.arrays;

import java.util.Arrays;

public class Sort0ToL1ToR {
    // OPTIMIZED VERSION  using two pointer approach
    public static void sortArray(){
                int[] array = {0, 1, 0, 0, 1, 0, 1, 0, 0, 1};
                int  left=0,right=array.length-1;
                while(left<right) {
                    while (array[left]  ==0) {
                        left++;
//                        System.out.println (left);
                    }
                    while (array[right]  == 1) {
                        right--;
//                        System.out.println (right);
                    }
                    if (left < right) {
                        int x = array[left];
                        array[left] = array[right];
                        array[right] = x;
                    }
                }
                System.out.println (Arrays.toString (array));
            }
    public static void main(String[] args){
                int[] s={0,0,1,0,0,0,1,0,1,0,0,0,1,1};
                int i;
                int l=s.length;
                int c=0;
                int count0=0;
                for(i=0;i<l-1;i++){
                    if(s[i]==0){
                        count0+=1;
                    }
                }
                while(c<l){
                    for(i=0;i<l-1;i++){
                        if(s[i]==1&&s[i+1]==0){
                            c=0;
                            int k = s[i];
                            s[i]= s[i+1];
                            s[i+1]=k;
                        }
                    }
                    for(i=0;i<count0;i++){
                        if((s[i]==0)){
                            c++;
                        }
                    }
                }
                System.out.println("a"+ Arrays.toString(s));
                sortArray();
            }
        }

