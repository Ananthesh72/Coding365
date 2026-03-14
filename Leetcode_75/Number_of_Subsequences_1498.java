package Leetcode_75;
import java.util.*;
public class Number_of_Subsequences_1498 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 7};
        int target = 9;
        int result = numSubseq(nums, target);
        System.out.println(result); // Output: 4
    }

    public static int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0, right = n - 1;
        int mod = 1000000007;
        long[] power = new long[n + 1];
        power[0] = 1;

        for (int i = 1; i <= n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }

        int count = 0;
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                count = (int)((count + power[right - left]) % mod);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}