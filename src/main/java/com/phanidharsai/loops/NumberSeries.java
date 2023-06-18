/**     sample input
 2            // number of series
 0 2 10       // a=0, b=2, n=10
 5 3 5

        sample out put
 2 6 14 30 62 126 254 510 1022 2046  // 1st term= (a+(2**0)*b) 2nd term= (a+(2**0)*b + a+(2**1)*b)+......
 8 14 26 50 98                      // same as above format
 *                     */

package com.phanidharsai.loops;

import java.util.Scanner;

public class NumberSeries {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            int i=0;
            while(i<t){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int result=0;
                int j=0;
                while(j<n){
                    result=(int)((Math.pow(2,j))*b)+result;
                    System.out.print(result+a+" ");
                    j++;
                }
                System.out.println();
                i++;
            }
            in.close();
        }
    }


