package org.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

    public class FindOverLappingIntervals {

        public static void main(String[] args) {
            Interval[] intervals=new Interval[5];
            intervals[0]=new Interval(2,3);
            intervals[1]=new Interval(4,5);
            intervals[2]=new Interval(6,7);
            intervals[3]=new Interval(8,9);
            intervals[4]=new Interval(1,10);

            mergeIntervals(intervals);
        }


        public static List<Interval> mergeIntervals(Interval[] intervals) {
            Arrays.sort(intervals,(o1,o2)-> {return o1.start-o2.start;});
            ArrayList<Interval> result=new ArrayList();

            for(Interval interval:intervals){
                if(result.size()==0){
                    result.add(interval);
                }else if(checkIfIntervalAreOverlapping(result.get(result.size()-1),interval)){
                    Interval lastOject=result.get(result.size()-1);
                    lastOject.finish=((lastOject.finish>=interval.finish)?lastOject.finish:interval.finish);
                    lastOject.start=((lastOject.start>=interval.start)?interval.start:lastOject.start);
                }else{
                    result.add(interval);
                }
            }

            return result;
        }

        public static boolean checkIfIntervalAreOverlapping(Interval interval1,Interval interval2){
            if(interval1.finish>=interval2.start){
                return true;
            }else if(interval2.finish<=interval1.start){
                return true;
            }
            return false;
        }
    }

class Interval {
    int start;int finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}
