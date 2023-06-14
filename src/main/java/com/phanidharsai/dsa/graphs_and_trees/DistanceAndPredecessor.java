// Traverse the graph

// As long as the queue is not empty:
//  Repeatedly dequeue a vertex u from the queue.
//
//  For each neighbor v of u that has not been visited:
//     Set distance to 1 greater than u's distance
//     Set predecessor to u
//     Enqueue v
//
//  Hint:
//  use graph to get the neighbors,
//  use bfsInfo for distances and predecessors

package com.phanidharsai.dsa.graphs_and_trees;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.Queue;

class BFSInfo {
    public BFSInfo() {
        this.distance = -1;
        this.predecessor = -1;
    }

    public BFSInfo(int distance, int predecessor) {
        this.distance = distance;
        this.predecessor = predecessor;
    }

    public int distance;
    public int predecessor;

    @Override
    public String toString() {
        return "BFSInfo{" +
                "distance=" + distance +
                ", predecessor=" + predecessor +
                '}';
    }
};

class Main {
    public static void doBFS(int[][] graph, int source) {
        System.out.println(graph.length);
        BFSInfo[] bfsInfo = new BFSInfo[graph.length];

         bfsInfo[source] = new BFSInfo(0,-1);

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(source);
        boolean[] vis =new boolean[graph.length];
        vis[source]=true;
//        int distance=0;  // initialized in while loop directly

//        for(int i=0;i<graph.length;i++){  // initialized in for loop while traversing through graph
//            bfsInfo[i]=new BFSInfo();
//        }
//        bfsInfo[source].distance=0;      initialized using constructor
        while(!(q.isEmpty())){
            int node = q.poll();
//            int count=0;
            int distance=bfsInfo[node].distance+1;
            for(int it: graph[node]){
                if(vis[it]==false){
                    bfsInfo[it]=new BFSInfo();
                    bfsInfo[it].predecessor=node;
                    bfsInfo[it].distance=distance;
                    vis[it]=true;
                    q.add(it);
//                    count=count+1;
                }
            }
        }

         System.out.println(Arrays.toString(bfsInfo));
    }
    public static void main(String[] args){
        int[][] graph= {{1}, {0, 4, 5}, {3, 4, 5}, {2, 6}, {1, 2}, {1, 2, 6}, {3, 5, 7}, {6}};
        doBFS(graph,3);
    }
}










