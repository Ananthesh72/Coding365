import java.util.Arrays;

public class Leetcode_3736 {

    public static void main(String[] args) {

        int[] nums = { 2,3,1};

        int res = minMoves(nums);
        System.out.println(res);
    }

    public static int minMoves(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int maxnum = 0;
        for(int i=0;i<n;i++){
            maxnum = Math.max(maxnum, nums[i]);
            sum += nums[i];
        }

        return  (int) ((long) maxnum * n - sum);
    }
}