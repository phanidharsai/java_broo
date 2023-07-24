package com.phanidharsai.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEvToLeftOdToRight {
    public static void main(String[]  args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(6);
        list.add(8);

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                int even_number=list.remove(i);
                list.add(0,even_number);
            }
        }
        System.out.println(list);
    }
}
