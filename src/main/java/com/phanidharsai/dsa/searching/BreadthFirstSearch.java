package com.phanidharsai.dsa.searching;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static String bFS(int[][] input,int source,int num) {
        boolean[] vis = new boolean[input.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        vis[source] = true;
        int level = 0;
        int childCount=0;
        while (!(q.isEmpty())) {
            int node = q.poll();
            if (node == num) {
                return "found at level " +level;
            } else {
                for (int child : input[node]) {
                    if (child == num) {
                        return "found "+num+ " at level "+level ;
                    } else if (vis[child] == false) {
                        vis[child] = true;
                        q.add(child);
                    }
                }

            }
        }
        return "not found";
    }
    public static void main(String[] args){
        int[][] graph= {{1}, {0, 4, 5}, {3, 4, 5}, {2, 6}, {1, 2}, {1, 2, 6}, {3, 5, 7}, {6}};
        System.out.println(bFS(graph,0,6));
    }
}
