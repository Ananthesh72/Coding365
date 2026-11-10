import java.util.Arrays;
import java.util.TreeMap;

public class Leetcode_3505 {
    public static void main(String[] args) {

        int[] nums = { 5, -2, 1, 3, 7, 3, 6, 4, -1 };
        int x = 3;
        int k = 2;
        long res = minOperations(nums, x, k);

        System.out.println(res);
    }

    static class MedianCost {

        TreeMap<Integer, Integer> left = new TreeMap<>();
        TreeMap<Integer, Integer> right = new TreeMap<>();

        int leftSize = 0;
        int rightSize = 0;

        long leftSum = 0;
        long rightSum = 0;

        void add(int val) {

            if (left.isEmpty() || val <= left.lastKey()) {
                insert(left, val);
                leftSize++;
                leftSum += val;
            } else {
                insert(right, val);
                rightSize++;
                rightSum += val;
            }

            balance();
        }

        void remove(int val) {

            if (left.containsKey(val)) {

                delete(left, val);
                leftSize--;
                leftSum -= val;

            } else {

                delete(right, val);
                rightSize--;
                rightSum -= val;
            }

            balance();
        }

        void balance() {

            while (leftSize > rightSize + 1) {

                int val = left.lastKey();

                delete(left, val);
                leftSize--;
                leftSum -= val;

                insert(right, val);
                rightSize++;
                rightSum += val;
            }

            while (leftSize < rightSize) {

                int val = right.firstKey();

                delete(right, val);
                rightSize--;
                rightSum -= val;

                insert(left, val);
                leftSize++;
                leftSum += val;
            }
        }

        long getCost() {

            int median = left.lastKey();

            return (long) median * leftSize - leftSum
                    + rightSum - (long) median * rightSize;
        }

        void insert(TreeMap<Integer, Integer> map, int val) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        void delete(TreeMap<Integer, Integer> map, int val) {

            int count = map.get(val);

            if (count == 1) {
                map.remove(val);
            } else {
                map.put(val, count - 1);
            }
        }
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        // Step 1: Calculate every window's cost
        long[] cost = new long[n - x + 1];

        MedianCost mc = new MedianCost();

        for (int i = 0; i < n; i++) {

            mc.add(nums[i]);

            if (i >= x) {
                mc.remove(nums[i - x]);
            }

            if (i >= x - 1) {
                cost[i - x + 1] = mc.getCost();
            }
        }

        // Step 2: Dynamic Programming

        long INF = Long.MAX_VALUE / 4;

        long[][] dp = new long[k + 1][n + 1];

        for (int t = 1; t <= k; t++) {
            Arrays.fill(dp[t], INF);
        }

        // Zero selected subarrays = zero operations
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }

        for (int t = 1; t <= k; t++) {

            for (int i = 1; i <= n; i++) {

                // Choice 1: Skip current element
                dp[t][i] = dp[t][i - 1];

                // Choice 2: Select a window ending here
                if (i >= x) {

                    dp[t][i] = Math.min(
                        dp[t][i],
                        dp[t - 1][i - x] + cost[i - x]
                    );
                }
            }
        }

        return dp[k][n];
    }

}
