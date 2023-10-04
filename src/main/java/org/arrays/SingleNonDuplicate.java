import java.util.ArrayList;

public class SingleNonDuplicate
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int numberWithCountOne=arr.get(0);
        int count=1;
            for(int i=1;i<arr.size();i++){
                if(count==2){
                    count=0;
                }
                if(arr.get(i)==numberWithCountOne && (count==0 || count==1)){
                    count++;
                }else if(count==1){
                    break;
                }else{
                    count=1;
                }
                numberWithCountOne=arr.get(i);
            }
        return numberWithCountOne;
    }
}
