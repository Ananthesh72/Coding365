
public class Leetcode_31 {
    public static void main(String[] args) {

        int[] nums = { 2, 4, 3, 1 };

        nextPermutation(nums);

        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (nums[nums.length - 1] != nums[i]) {
                System.out.print(nums[i] + ",");
            } else
                System.out.print(nums[i] + "");
        }
        System.out.print("]");
    }

    public static void nextPermutation(int[] nums) {

        if (nums == null || nums.length <= 1)
            return;

        // Step 1: Find the first decreasing element from the right
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2 & 3: If pivot is found, find successor and swap
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 4: Reverse the elements to the right of the pivot
        reverse(nums, i + 1, nums.length - 1);

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
