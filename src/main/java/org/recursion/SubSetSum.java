package org.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubSetSum {
    public static void main(String[] args) {
        System.out.println(subsetSum(new int[] { 5, 2, 1 }));
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        int sum=0;
        ArrayList<Integer> res=new ArrayList<>();
        subSetSumRecurssion(num,0,sum,res);
        Collections.sort(res);
        return res;
    }

    public static void subSetSumRecurssion(int num[],int index,int sum,ArrayList<Integer> res){
        if(index==num.length){
            res.add(sum);
            return;
        }else{
            //pick the current index item
            sum=sum+num[index];
            subSetSumRecurssion(num,index+1,sum,res);
            //do not pick the current index item
            sum=sum-num[index];
            subSetSumRecurssion(num,index+1,sum,res);
        }
    }
}
