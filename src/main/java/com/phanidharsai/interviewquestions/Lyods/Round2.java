/** input: 1
 *  output: [[A, B, C], [D]]
 *  shows people with atleast one connection in first collection and other in second connection
 * */

package com.phanidharsai.interviewquestions.Lyods;

import java.util.*;

public class Round2 {
    public static List<List<String>> getConnections(String[][] input, int num) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> temp = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            String eventType = input[i][0];
            String person1 = input[i][1];
            String person2 = input[i][2];
            if (eventType.equals("CONNECT")) {
                if (!(temp.get(person1) == null && temp.get(person2) == null)) {
                    temp.put(person1, temp.get(person1) + 1);
                    temp.put(person2, temp.get(person2) + 1);
                } else {
                    temp.put(person1, 1);
                    temp.put(person2, 1);
                }
            } else {
                temp.put(person1, temp.get(person1) - 1);
                temp.put(person2, temp.get(person2) - 1);
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
