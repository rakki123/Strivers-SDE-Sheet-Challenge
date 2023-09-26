public class MajorityElementNBy2 {
public static int majorityElement(int []v) {
        HashMap<Integer,Integer> mapOfCount=new HashMap<>();

        for(int i:v){
            Integer count=mapOfCount.get(i);
            if(count==null){
                mapOfCount.put(i,1);
            }else{
                mapOfCount.put(i, count+1);
            }
        }

        for(int key:mapOfCount.keySet()){
            int count=mapOfCount.get(key);
            if(count>(v.length/2)){
                return key;
            }
        }

        return -1;
    }
}
