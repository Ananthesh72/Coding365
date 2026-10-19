import java.util.Arrays;

public class Leetcode_3727 {

    public static void main(String[] args) {

        int[] nums = { -3, -1, -2, 1, 3, 2 };

        long res = maxAlternatingSum(nums);
        System.out.println(res);
    }

    public static long maxAlternatingSum(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            nums[i] = nums[i] * nums[i];
        }

        long result = Sortinglogic(nums);

        return result;
    }

    public static long Sortinglogic(int[] nums) {
        Arrays.sort(nums);

        long sum = 0;
        int m = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {

            if (i < m) {
                sum -= nums[i];
            } else {
                sum += nums[i];
            }

        }
        return sum;
    }
}