
import java.util.HashMap;
import java.util.Map;

public class Leetcode_1 {
    public static void main(String[] args) {
        


        int [] arr ={3,4,4,1,1};
        int traget = 6;
        int [] result = twoSum(arr,traget);

        System.out.println(java.util.Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

}
