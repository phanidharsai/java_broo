/** input: 6
 * (** if it is array)
 *  output: [[1, 0, 0, 0, 0, 0], [1, 1, 0, 0, 0, 0], [1, 2, 1, 0, 0, 0], [1, 3, 3, 1, 0, 0], [1, 4, 6, 4, 1, 0], [1, 5, 10, 10, 5, 1]]
 *          [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1], [1, 5, 10, 10, 5, 1]]
 * */

package com.phanidharsai.arrays;

import java.util.ArrayList;
import java.util.Arrays;
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
                else{
                    pascalTri[i][j]=pascalTri[i-1][j-1]+pascalTri[i-1][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(pascalTri));
    }
    public static void printPascalTriList(int size){
        List<List<Integer>> pascal= new ArrayList<>();
        for(int i=0;i<size;i++){
            List<Integer> row= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else {
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
