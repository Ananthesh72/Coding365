import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RmDuplifunsorarr {
    public static void main(String[] args) {
        
        int [] arr ={1, 2, 3, 1, 4, 2};
    //   LinkedHashSet <Integer> res = new LinkedHashSet<Integer>();
    //     for(int i : arr){
    //         res.add(i);
    //     }
    //     ArrayList<Integer> newres = new ArrayList<>(res);
    //     System.out.println(newres);
    int[] uniqueArr = Arrays.stream(arr).distinct().toArray();

    System.out.println(Arrays.toString(uniqueArr));
    
    }
}
