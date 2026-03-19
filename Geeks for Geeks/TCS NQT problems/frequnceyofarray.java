import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class frequnceyofarray {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 2, 3, 5 };
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] result = new int[arr.length];
        for (int i = 1; i <= arr.length; i++) {
            result[i - 1] = map.getOrDefault(i, 0);
        }
        List<Integer> res = new ArrayList<>();
        for(int b : result){
            res.add(b);
        }
        System.out.println(res);
    }
}