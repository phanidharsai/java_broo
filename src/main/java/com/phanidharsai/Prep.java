package com.phanidharsai;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Prep {
//1
//3 4
//6 7 8
//10 11 12 13
//15 16 17 18 19
    public static void numPat(){
        int count = 0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(i+count+j-1+"  ");
            }
            System.out.println();
            count+=i;
        }
    }



//    int[] s={0,0,1,0,0,0,1,0,1,0,0,0,1,1};


    public static void main(String[] args) throws IOException {
        int[] arr = {0, 1, 0, 0, 1, 3, 2, 5, 3, 2, 3, 4, 1, 5};
        int[] arr2 = {3, 1, 2, 5, 4, 7, 6};

        String str = "asdfaghjklkjhgfdsa";
        Character rep = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(a->a.getValue()>1).map(Map.Entry::getKey).findFirst().get();
        Character minFreq = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(i->i,Collectors.counting()))
                .entrySet().stream().min(Comparator.comparingLong(Map.Entry::getValue)).map(Map.Entry::getKey).get();
        System.out.println("MINFREQ"+ minFreq);
//            groupAnagrams(str);
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]>arr2[j]){
                    int temp = arr2[j];
                    arr2[j]=arr2[i];
                    arr2[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        //        0, 1, 0, 0, 1, 3, 2, 5, 3, 2, 3, 4, 1, 5
        // 5,6,0,1,2,3,4
//        remDupUnsorted(arr);
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        rotate(arr2,num);
//        inPlace(arr2,num);
        int[] s = {0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1};
        numPat();

    }

    private static void remDupUnsorted(int[] arr) {
        int index =1;
        for(int i=1;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<index;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=-1;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
