package org.arrays;

public class KadaneAlgorithm {
    public static long maxSubarraySum(int[] input, int n) {
        int maxSubArraySum=0,maxSubArraySum1=Integer.MIN_VALUE;

        for(int i=0;i<input.length;i++) {
            int intermediateSum=maxSubArraySum+input[i];
            if(intermediateSum>0) {
                maxSubArraySum=intermediateSum;
            }else {
                maxSubArraySum=0;
            }
            maxSubArraySum1=(maxSubArraySum>maxSubArraySum1)?maxSubArraySum:maxSubArraySum1;
        }
        return maxSubArraySum1;
    }
}
