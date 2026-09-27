
public class Leetcode_26 {
    public static void main(String[] args) {

        int[] nums = { 0,0,1,1,1,2,2,3,3,4 };
        // int[] nums = { 1,1,2};
        if (nums.length == 0)
            return;
        int p = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[p] = nums[i];
                p++;
            }
        }
        System.out.println("Unique elements: " + p);
        for (int k = 0; k <= p; k++) {
            System.out.print(  nums[k] + " ");
        }
    }
}