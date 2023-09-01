package com.phanidharsai.interviewquestions.LyodsInterview;

import java.util.*;

public class Round2 {
    public static List<List<String>> getConnections(String[][] input, int num) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> temp = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i][0].equals("CONNECT")) {
                if (!(temp.get(input[i][1]) == null && temp.get(input[i][2]) == null)) {
                    temp.put(input[i][1], temp.get(input[i][1]) + 1);
                    temp.put(input[i][2], temp.get(input[i][2]) + 1);
                } else {
                    temp.put(input[i][1], 1);
                    temp.put(input[i][2], 1);
                }
            } else {
                temp.put(input[i][1], temp.get(input[i][1]) - 1);
                temp.put(input[i][2], temp.get(input[i][2]) - 1);
            }
        }
        List<String> res0=new ArrayList<>();
        List<String> res1=new ArrayList<>();
        for(Map.Entry<String,Integer> entry: temp.entrySet()){
            if(entry.getValue()>0){
                res0.add(entry.getKey());
            }
            else{
                res1.add(entry.getKey());
            }
        }
        res.add(res0);
        res.add(res1);
        return res;
    }
    public static void main(String[] args) {
        String[][] events = {{"CONNECT", "A", "B"}, {"CONNECT", "C", "D"}, {"DISCONNECT", "D", "C"}, {"CONNECT", "A", "C"}};
        
        System.out.println(getConnections(events,1));
    }
}
