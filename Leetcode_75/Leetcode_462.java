import java.util.Arrays;

public class Leetcode_462 {
    
     public static void main(String[] args) {

        int[] nums = {1,10,2,9};
        int res = minMoves2(nums);

        System.out.println(res);

    }

    public static int minMoves2(int[] nums) {

        Arrays.sort(nums);
       int l =0;
       int r=nums.length -1;
       int moves=0;

       while(l < r){
        moves+= nums[r] - nums[l];
        r--;
        l++;
       }
       return moves;
         
    }
}
