public class maxSubarraySum {
    public static void main(String[] args) {
        int [] arr = {100, 200, 300, 400};
        int k =2;
        int n = arr.length;
        int windsum = 0;
        
        for(int i =0;i< k;i++){
            windsum+=arr[i];
        }
        int maxsum =windsum;
        
        for(int j =k;j<n;j++){
            windsum+=arr[j];
            windsum-=arr[j-k];
            
         maxsum = Math.max(maxsum,windsum);
        }
        System.out.println(maxsum);
    }
}
