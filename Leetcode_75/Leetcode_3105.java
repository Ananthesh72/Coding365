public class Leetcode_3105 {
    public static void main(String[] args) {
        
        // int[] nums = new int[]{1, 4, 3, 3, 2};
        // int[] nums = new int[]{3, 3, 3, 3};
        // int[] nums = new int[]{3, 2, 1};
        int[] nums = new int[]{1,10,10};
        

        System.out.println(longestMonotonicSubarray(nums));
    }


    public static int longestMonotonicSubarray(int[] nums) {

        int inc=1,dec=1,max_len=1;
        for(int i=1;i<nums.length;i++){

            if(nums[i] > nums[ i-1]){
                inc++;
                dec=1;
            }else if(nums[i] < nums[ i-1]){
                dec++;
                inc=1;
            }else{
                inc=1;
                dec=1;
            }
            max_len = Math.max(max_len, Math.max(inc, dec));
        }
        return max_len;
    }
}
