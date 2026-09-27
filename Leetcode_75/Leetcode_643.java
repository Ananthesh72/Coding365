// LeetCode 643. Maximum Average Subarray I
public class Leetcode_643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; 
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k; 
    }
    public static void main(String[] args) {
        Leetcode_643 obj = new Leetcode_643();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(obj.findMaxAverage(nums, k)); // Output: 12.75
     }
}
