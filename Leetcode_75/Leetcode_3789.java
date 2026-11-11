public class Leetcode_3789 {

    public static void main(String[] args) {

        int cost1 = 5;

        int cost2 = 4;
        int costBoth = 15;
        int need1 = 0;
        int need2 = 0;

        long result = minimumCost(cost1, cost2, costBoth, need1, need2);
        System.out.println(result);

    }

    public static long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long a = (long) need1 * cost1 + (long) need2 * cost2;
        long b = (long) costBoth * Math.max(need1, need2);
        long mn = Math.min(need1, need2);
        long c = costBoth * mn + (need1 - mn) * cost1 + (need2 - mn) * cost2;

        return Math.min(a, Math.min(b, c));
    }
}