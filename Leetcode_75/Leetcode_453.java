
public class Leetcode_453 {

    public static void main(String[] args) {

        int[] nums = { 83,86,77,15,93,35,86,92,49,21 };
        int res = minMoves(nums);

        System.out.println(res);

    }

    public static int minMoves(int[] nums) {

        long sum = 0;
        int n = nums.length;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }
        return (int) sum - n * min;
    }
}
