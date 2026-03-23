public class MaxProductSubarray {

    public static void main(String[] args) {

        int arr [] ={-1,-9,1,0,10,10,-1,4};
        MaxProductSubarray obj = new MaxProductSubarray();
        System.out.println(obj.maxProduct(arr));

    }



    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int leftp= 1;
        int rightp= 1;
        int res =arr[0];

        for(int i=0;i<n;i++){

            leftp = (leftp ==0)? leftp=1 : leftp;
            rightp = (rightp == 0)? rightp=1 : rightp;

            rightp *= arr[i];
            leftp *=arr[n-1-i];

            res = Math.max(res, Math.max(leftp, rightp));
        }

        return res;
    }

}