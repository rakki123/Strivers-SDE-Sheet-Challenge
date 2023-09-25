package org.arrays;

public class PascalTraingle {
    
    public static int[][] pascalTriangle(int N) {
        int result[][]=new int[N][];
        if(N==1 || N>1){
            result[0]=new int[1];
            result[0][0]=1;
        }
         if(N==2 || N>2){
            result[0]=new int[1];
            result[0][0]=1;
            result[1]=new int[2];
            result[1][0]=1;
            result[1][1]=1;
        }if(N>2){
            for(int i=2;i<N;i++){
                result[i]=new int[i+1];
                int data=1;
                for(int j=0;j<(i+1);j++){
                    if(j==0 || j==i){
                        result[i][j]=1;
                    }else{
                        result[i][j]=result[i-1][j]+result[i-1][j-1];
                    }
                }
            }
        }
        return result;
    }
