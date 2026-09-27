import java.util.*;
public class Leetcode_16 {
    public int Leetcode_16(int[] nums, int target) {
        Arrays.sort(nums);
        int closesum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left = i +1;
            int right = nums.length - 1;
            while( left < right){
                int currsum = nums[i] + nums[left] + nums[right];

                if(Math.abs(currsum - target) < Math.abs(closesum - target)){
                    closesum = currsum;
                }
                if(currsum < target){
                    left++;
                }else if(currsum > target){
                    right--;
                }else{
                    return target;
                }
            }
        }
        return closesum;
    }

    public static void main(String[] args) {
        Leetcode_16 obj = new Leetcode_16();
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(obj.Leetcode_16(nums, target)); // Output: 2
    }
}