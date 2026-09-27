
import java.util.Arrays;

/*Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0] */


public class Leetcode_283 {
    public static void main(String[] args) {
        

        int [] arr = {0,1,0,3,12};
        int n = arr.length;

        int left =0;

        for (int right=0;right < n ;right++){
            
            if(arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                System.out.println((arr.toString())); 
                left++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
