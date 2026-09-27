
import java.util.HashMap;
//1679. Max Number of K-Sum Pairs
public class Leetcode_1679 {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num; // Calculate the complement needed to form k
            if (map.getOrDefault(complement, 0) > 0) {
                count++; // We found a valid pair
                map.put(complement, map.get(complement) - 1); // Decrease the count of the complement
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count; // Return the total count of pairs
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        System.out.println(maxOperations(nums, k)); // Output: 2
    }
}