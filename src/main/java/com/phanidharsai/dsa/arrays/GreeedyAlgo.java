package com.phanidharsai.dsa.arrays;

public class GreeedyAlgo {
    public static void getBestbuy(int[] in){
        int maxProfit=0;
        int minPrice=in[0];
        for(int i=1;i<in.length-1;i++){
            if(in[i]<minPrice){
                minPrice=in[i];
            }
            for(int j=i+1;j<in.length;j++) {
                maxProfit = Math.max(maxProfit, in[j] - minPrice);
            }
        }
        System.out.println(maxProfit);

    }
    public static void main(String[] args){
        int[] prices = {800000, 300000, 500000, 200000, 700000, 900000};
        getBestbuy(prices);

    }
}
