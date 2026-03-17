
import java.util.HashMap;

public class arraysubset {
    public static void main(String[] args) {

        int[] a = { 11, 7, 1, 13, 21, 3, 7, 3 };
        int[] b = { 11, 3, 7, 1, 7,55 };

        
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i : a){
        map.put(i, map.getOrDefault(i,0)+1);
       }
       System.out.println(map);

       for(int j :b){
        if(!map.containsKey(j) || map.get(j) <=0){
            return ;
        }
        map.put(j, map.get(j) - 1);
       }
       return;
    }
}