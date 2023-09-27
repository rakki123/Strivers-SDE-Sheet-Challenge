import java.util.*;
public class TwoSum {
    public static String read(int n, int []book, int target){
        HashMap<Integer,Integer> mapOfCount=new HashMap<>();
        for(Integer data:book){
            Integer dataPresent=mapOfCount.get(data);
            if(dataPresent==null){
                mapOfCount.put(data,1);
            }else{
                mapOfCount.put(data,dataPresent+1);
            }
        }

        for(Integer key:mapOfCount.keySet()){
            Integer distanceFromTarget=target-key;
            Integer count=mapOfCount.get(distanceFromTarget);;
            if(distanceFromTarget==key && count!=null && count>1){
                return "YES";
            }else if(count!=null){
                return "YES";
            }
        }
        return "NO";
    }
}
