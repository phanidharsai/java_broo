
/**  Convert the given matrix such that if there is zero at index i,j where i is row and j is column convert all the
 *   elements in the row i and column j to zero.
 *   eg [1,1,1]   to  [1,0,1]            [1, 1, 1, 1]           [0, 0, 0, 1]
 *      [1,0,1]       [0,0,0]             [1, 0, 1, 1]          [0, 0, 0, 0]
 *      [1,1,1]       [1,0,1]             [1, 1, 0, 1]          [0, 0, 0, 0]
 *                                        [0, 1, 1, 1]          [0, 0, 0, 0]
 *   APPROACH =====>
 *   STEP-1: Traverse through the matrix if an element at index i,j is zero mark the corresponding row at 0th column and
 *           corresponding column at 0th row to zero.
 *           ****** special case if j=0 create a new variable and use it for column 0 as it collides with row 0
 *   STEP-2: Convert all the elements from index(1,1) to (m-1,n-1) to zeroes not converting 0th column and 0th row as we
 *           are using them as markers
 *   STEP-3: Convert the 0th row elements to zeros first and then 0th column elements bcoz if we use 0th column first
 *           it will convert all 0th column to zero and that might be a problem if 0,0 is not zero and it will impact
 *           0th column.
 *                                                                                  */

package com.phanidharsai.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
    public static void setMatrixZero(ArrayList<ArrayList<Integer>> input, int m, int n){
        int col0=1;
        // using 0th row and 0th column as marker for noting which rows and columns to be updated and col0 for
        // special case when 0th row is 0 but 0th column is not.
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(input.get(i).get(j)==0){
                    // marking 0th row zero where item at i,j=0
                    input.get(i).set(0,0);
                    // if j!=0 directly update
                    if(j!=0) {
                        input.get(0).set(j, 0);
                    }
                    // else use col0 as marker
                    else{
                        col0=0;
                    }
                }
            }
        }

        // updating the elements of corresponding rows and columns to zeros from index (1,1) to (m-1,n-1)
        for(int k=1;k<m;k++){
            for(int l=1;l<n;l++){
                if(input.get(k).get(0)==0 || input.get(0).get(l)==0){
                    input.get(k).set(l,0);
                }
            }
        }

        // updating the elements for 0th row if index 0,0 is marked as zero
        if(input.get(0).get(0)==0) {
            for (int p=0;p<n;p++){
                input.get(0).set(p,0);
            }
        }

        // updating the elements for 0th col if col0 is marked as zero
        if(col0==0){
            for(int q=0;q<m;q++){
                input.get(q).set(0,0);
            }
        }
        System.out.println(input.toString());

    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> initial= new ArrayList<>();
        initial.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
        initial.add(new ArrayList<>(Arrays.asList(5,0,7,8)));
        initial.add(new ArrayList<>(Arrays.asList(0,10,11,12)));
        initial.add(new ArrayList<>(Arrays.asList(13,14,15,0)));
        int rowLen= initial.size();
        int colLen=initial.get(0).size();
        System.out.println(initial.toString());
        setMatrixZero(initial,rowLen,colLen);
//        using matrices
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        int zeroth_j =1;
        System.out.println((matrix.length));
        int m=matrix.length;
        int n= matrix[0].length;
        System.out.println(m+" "+ n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }
                    else {
                        zeroth_j = 0;
                    }
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0|| matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(zeroth_j==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
