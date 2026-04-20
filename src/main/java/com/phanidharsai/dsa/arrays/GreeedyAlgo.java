package com.phanidharsai.dsa.arrays;

//        int[] prices = {800000, 300000, 500000, 200000, 700000, 900000};
//                int[] prices2 = {800000, 600000, 500000, 400000, 300000, 200000};

public class GreeedyAlgo {
    public static void getBestbuy(int[] in){
        int maxProfit=0;
        int minPrice=in[0];
        for(int i=1;i<in.length;i++){
            maxProfit = Math.max(maxProfit, in[i] - minPrice);
            if(in[i]<minPrice){
                minPrice=in[i];
            }
        }
        System.out.println(maxProfit);

    }

    public static void getBestbuyNegative(int[] in){
        int minPrice = in[0];
        int minLoss = -99999999;
        int currentMinLoss =0;
        for(int i=1;i<in.length;i++){
            currentMinLoss=in[i]-minPrice;
            if(minPrice>in[i]){
                minPrice = in[i];
            }
            if(currentMinLoss>minLoss){
                minLoss=currentMinLoss;
            }
        }
        System.out.println(minLoss);

    }
    public static void main(String[] args){
        int[] prices = {800000, 300000, 500000, 200000, 700000, 900000};
        int[] prices2 = {1000000, 700000, 500000, 400000, 100000};
        getBestbuy(prices);
        getBestbuyNegative(prices2);

    }
}
