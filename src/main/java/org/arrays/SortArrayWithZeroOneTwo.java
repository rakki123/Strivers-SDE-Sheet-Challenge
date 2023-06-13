package org.arrays;

public class SortArrayWithZeroOneTwo {
    public static void sort012(int[] input)
    {
        int lastPositionOfData=0;


        for(int i=0;i<input.length;i++) {
            if(input[i]==0) {
                input[i]=input[lastPositionOfData];
                input[lastPositionOfData]=0;
                lastPositionOfData++;
            }
        }

        for(int i=lastPositionOfData;i<input.length;i++) {
            if(input[i]==1) {
                input[i]=input[lastPositionOfData];
                input[lastPositionOfData]=1;
                lastPositionOfData++;
            }
        }

        for(int i=lastPositionOfData;i<input.length;i++) {
            if(input[i]==2) {
                input[i]=input[lastPositionOfData];
                input[lastPositionOfData]=2;
                lastPositionOfData++;
            }
        }
    }
}
