public class subarraywithsumk {
    public static void main(String[] args) {

        int[] arr = { 10, 2, -2, -20, 10 };
        int n = arr.length;
        int countsum = 0;
        int sum = 0;
        int k = -10;

        if(arr.length == 0 & k ==0) System.out.println(0);
        if(arr.length == 1) System.out.println(arr[0]);
        
        for (int i = 0; i < n; i++) {

            sum += arr[i];
            if (sum == k) {
                countsum++;
                i-=3;
                sum =0;
            }
        }
        System.out.println(countsum);

    }
}
