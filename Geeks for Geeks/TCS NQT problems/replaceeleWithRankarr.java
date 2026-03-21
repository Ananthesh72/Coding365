import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class replaceeleWithRankarr {
    public static void main(String[] args) {

        // int[] arr = { 20, 15, 26, 2, 98, 6 };//4, 3, 5, 1, 6, 2
        int[] arr = { 2, 2, 1, 6 };//2, 2, 1, 3

        int n = arr.length;
        System.out.println(Arrays.toString(replaceWithRank(arr, n)));
    }

    static int[] replaceWithRank(int arr[], int N) {
        // code here
        System.out.println("Before sorting :-"+Arrays.toString(arr));
        // int [] newarr = new int[N];
        int [] newarr = arr.clone();
        Arrays.sort(newarr);
        // System.out.println("Sorting :"+Arrays.toString(newarr));

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for(int i=0;i<N;i++){
           
            if(!map.containsKey(newarr[i])){
                map.put(newarr[i],rank);
                rank++;
            }
        }
        // System.out.println("Arrays is mapped :-"+map);
       
        int [] result = new int[N];
        for(int i=0;i<N;i++){
           result[i] = map.get(arr[i]);
        }
        // System.out.println( map.get(arr[1]));

        return result;
    }

}
