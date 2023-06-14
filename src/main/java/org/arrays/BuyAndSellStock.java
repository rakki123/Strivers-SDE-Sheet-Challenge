package org.arrays;

import java.util.ArrayList;

public class BuyAndSellStock {
    public static int maximumProfit(ArrayList<Integer> prices){
        int arrayToSpeculateMinToLeftOfCurrent[]=new int[prices.size()];
        int minTillNow=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        for(int i=0;i<prices.size();i++) {
            minTillNow=(minTillNow>prices.get(i))?prices.get(i):minTillNow;
            arrayToSpeculateMinToLeftOfCurrent[i]=minTillNow;
        }

        for(int i=0;i<prices.size();i++) {
            int intermediateRes=prices.get(i)-arrayToSpeculateMinToLeftOfCurrent[i];
            maxProfit=(maxProfit<intermediateRes)?intermediateRes:maxProfit;
        }
        return maxProfit;
    }
}
