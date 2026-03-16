/*Given an array arr. Determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.  */
public class equal_sum {
    public static void main(String[] args) {

        equal_sum obj = new equal_sum();
        int[] arr = { 20, 13, 20, 11, 11, 16, 18, 15, 15, 12, 14, 16, 16, 15, 16, 15, 10, 11, 14 };
        String str = obj.equilibrium(arr);
        System.out.println(str);
    }

    String equilibrium(int[] arr) {
        int n = arr.length;
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = total - leftSum - arr[i];
            if (leftSum == rightSum) {
                return "YES";
            }
            leftSum += arr[i];
        }
        return "NO";
    }

}
