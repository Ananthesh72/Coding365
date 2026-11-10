public class Leetcode_3693 {
    public static void main(String[] args) {
        
        //Input: n = 4, costs = [1,2,3,4]
        int n = 4;
        int [] arr = new int[]{1,2,3,4};
        
        System.out.println(climbStairs(n, arr));
    }

    public static int climbStairs(int n, int[] costs) {
        
        int [] dp = new int[n +1];
        dp[0] =0;

        for(int j =1;j <= n ;j++){
            dp[j] = Integer.MAX_VALUE;

            for(int i= Math.max(0, j-3); i < j;i++){
                int jump = j - i;
                int totalcost = dp[i] + costs[j-1] + jump * jump;
                dp[j] = Math.min(dp[j], totalcost);
            }
        }
        return dp[n];
    }
}
