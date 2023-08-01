package com.phanidharsai.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void printPascalTri(int x){
        int[][] pascalTri=new int[x][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<=i;j++){
                if(j==0||i==j){
                    pascalTri[i][j]=1;
                }
                else if(i>1){
                    pascalTri[i][j]=pascalTri[i-1][j-1]+pascalTri[i-1][j];
                }
            }
        }
        for(int k=0;k<x;k++){
            for(int l=0;l<x;l++){
                System.out.print(pascalTri[k][l]+" ");
            }
            System.out.println();
        }
    }
    public static void printPascalTriList(int size){
        List<List<Integer>> pascal= new ArrayList<>();
        for(int i=0;i<size;i++){
            List<Integer> row= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else if(i>1){
                    row.add(pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
                }
            }
            pascal.add(row);
        }
        System.out.println(pascal);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        printPascalTri(size);
        printPascalTriList(size);
    }
}
