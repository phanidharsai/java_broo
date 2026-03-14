package com.phanidharsai.interviewquestions;

//input= {{"ADD", "1"},{"ADD", "2"},{"ADD", "2"},{"ADD", "4"},{"GET_NEXT", "1"},
//                {"GET_NEXT", "2"},{"GET_NEXT", "3"},{"GET_NEXT", "4"},{"REMOVE", "2"},
//                {"GET_NEXT", "1"},{"GET_NEXT", "2"},{"GET_NEXT", "3"},{"GET_NEXT", "4"}};
//output: query 1:na query 2:na query 3:na query 4:na query 5:2 query 6:4 query 7:4 query 8:na query 9:true query 10:2 query 11:4 query 12:4 query 13:na

import java.util.ArrayList;
import java.util.List;

public class PerformQueries {
    public static void main(String[] args){
        String[][] input= {{"ADD", "1"},{"ADD", "2"},{"ADD", "2"},{"ADD", "4"},{"GET_NEXT", "1"},
                {"GET_NEXT", "2"},{"GET_NEXT", "3"},{"GET_NEXT", "4"},{"REMOVE", "2"},
                {"GET_NEXT", "1"},{"GET_NEXT", "2"},{"GET_NEXT", "3"},{"GET_NEXT", "4"}};
        String[] sol = solution(input);
        int i=1;
        for(String val: sol){
            System.out.println("query "+ i +": "+val+" ");
            i++;
        }
    }

    static String[] solution(String[][] queries) {
        List<String> container = new ArrayList<>();
        String[] solContainer = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (queries[i][j].equals("EXISTS")) {
                    if (container.contains(queries[i][j + 1])) {
                        solContainer[i] = "true";
                    } else {
                        solContainer[i] = "false";
                    }
                } else if (queries[i][j].equals("ADD")) {
                    container.add(queries[i][j + 1]);
                    solContainer[i] = "na";
                } else if (queries[i][j].equals("REMOVE")) {
                    if (container.contains(queries[i][j + 1])) {
                        container.remove(queries[i][j + 1]);
                        solContainer[i] = "true";
                    } else {
                        solContainer[i] = "false";
                    }
                } else if (queries[i][j].equals("GET_NEXT")) {
                    Integer max= Integer.MAX_VALUE;
                    Integer int1 = Integer.parseInt(queries[i][j + 1]);
                    for (int k = 0; k < container.size(); k++) {
                        Integer int2 = Integer.parseInt(container.get(k));
                        if (int2 > int1 && int2<max) {
                            solContainer[i] = int2.toString();
                            max=int2;
                        }
                    }
                    if (max == Integer.MAX_VALUE) {
                        solContainer[i] = "na";
                    }
                }
            }
        }
        return solContainer;
    }
}
