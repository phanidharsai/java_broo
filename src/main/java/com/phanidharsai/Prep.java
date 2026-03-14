package com.phanidharsai;

import java.io.IOException;
import java.util.*;

public class Prep {


//    int[] s={0,0,1,0,0,0,1,0,1,0,0,0,1,1};


    public static void main(String[] args) throws IOException {
        int[] arr = {0, 1, 0, 0, 1, 3, 2, 5, 3, 2, 3, 4, 1, 5};
        int[] arr2 = {3, 1, 2, 5, 4, 7, 6};
        //        0, 1, 0, 0, 1, 3, 2, 5, 3, 2, 3, 4, 1, 5
        // 5,6,0,1,2,3,4
        remDupUnsorted(arr);
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        rotate(arr2,num);
//        inPlace(arr2,num);
        int[] s = {0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1};
    }

    private static void remDupUnsorted(int[] arr) {
        int size =1;
        for(int i=1;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[size]=arr[i];
                size++;
            }
        }
        for(int i=size;i<arr.length;i++){
            arr[i]=-1;
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void remDup(int[] arr) {
        int index =1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                arr[index]=arr[i+1];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}



