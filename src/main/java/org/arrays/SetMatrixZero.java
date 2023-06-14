package org.arrays;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {

    public static void setZeros(int input[][]) {
        Set<Integer> rowWhereZerosFoundInMatrix=new HashSet<>();
        Set<Integer> columnWhereZerosFoundInMatrix=new HashSet<>();

        int k=0,l=0;
        for(int i=0;i<input.length;i++) {
            for(int j=0;j<input[i].length;j++) {
                if(input[i][j]==0) {
                    rowWhereZerosFoundInMatrix.add(i+1);
                    columnWhereZerosFoundInMatrix.add(j+1);
                }
            }
        }

        for(int i:rowWhereZerosFoundInMatrix) {
            if(i!=0){
                for(int j=0;j<input[0].length;j++) {
                    input[i-1][j]=0;
                }
            }
        }

        for(int i:columnWhereZerosFoundInMatrix) {
            if(i!=0){
                for(int j=0;j<input.length;j++) {
                    input[j][i-1]=0;
                }
            }
        }
    }
}
