import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class minAnd2ndMin {
    public static void main(String[] args) {

        int [] arr = {10, 5, 20, 8};
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i : arr ){
            
            if( i < first){
                second = first;
                first = i;
            }else if(i < second && i!=first){
                second = i;
            }
        }
        ArrayList <Integer> result = new ArrayList<>();
        if(second == Integer.MAX_VALUE){
            result.add(-1);
        }else{
            // result.add(first);
            result.add(second);
        }
        System.out.println(result);
    }
}
