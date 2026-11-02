import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_2098{
    public static void main(String[] args) {
        
        int [] nums={1,2,5,2,3};
        int tarnum = 2;

        List<Integer> data = targetIndices(nums,tarnum);
        System.out.println(data);
    }


    public static List<Integer> targetIndices(int[] nums, int target) {

        // int lessCount = 0;
        // int targetCount = 0;

        List<Integer> result = new ArrayList<>();
        // Arrays.sort(nums);

        // for(int num : nums){
        //     if(num < target){
        //         lessCount++;
        //     }else{
        //         targetCount++;
        //     }
        // }
        
        // for(int i=0;i<targetCount;i++){
        //     if(target == nums[i]){
        //         result.add(lessCount +1);
        //     }
        // }


        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                result.add(i);
            }
        }

        return result;
    }

}