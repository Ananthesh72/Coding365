
import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_1207{


    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> count = new HashMap<>();

        for(int num : arr){
            count.put(num,count.getOrDefault(num,0)+1);//{1=2, 2=4, 5=4, 6=1, 9=6}
        }
        HashSet<Integer> count1= new HashSet<>(count.values());     //[1, 2, 4, 6]
        return count1.size() == count.size();        
    }
    public static void main(String[] args) {
        int[] arr = {1,1, 2,2,2,2, 5,5,5,5, 6,9,9,9,9,9,9};
        System.out.println(uniqueOccurrences(arr));
    }
}