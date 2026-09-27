
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_15 {

    public static void main(String[] args) {

        int[] arr = { -1, 0, 1, 2, -1, -4 };
        // int[] arr = { 0,0,0,0};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ls = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0)
                break;

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            if (nums[i] + nums[i + 1] + nums[i + 2] > 0)
                continue;

            if (nums[i] + nums[n - 2] + nums[n - 1] < 0)
                continue;

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    ls.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while (l < r && nums[l] == nums[l + 1])
                        l++;
                    while (l < r && nums[r] == nums[r - 1])
                        r--;

                    l++;
                    r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ls;

    }

}
