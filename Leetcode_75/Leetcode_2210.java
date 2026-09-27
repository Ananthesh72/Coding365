import java.util.ArrayList;
import java.util.List;
/*2210. Count Hills and Valleys in an Array */
public class Leetcode_2210 {
    public static void main(String[] args) {
        int [] arr={2,4,1,1,6,5};
        System.out.println(countHillValley(arr));
    }
    public static int countHillValley(int[] nums) {
        int count = 0;
        List<Integer> filtered = new ArrayList<>();
        filtered.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                filtered.add(nums[i]);
            }
        }

        for (int i = 1; i < filtered.size() - 1; i++) {
            int prev = filtered.get(i - 1);
            int curr = filtered.get(i);
            int next = filtered.get(i + 1);

            if (curr > prev && curr > next) {
                count++; // Hill
            } else if (curr < prev && curr < next) {
                count++; // Valley
            }
        }
        return count;
    }
}
