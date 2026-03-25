import java.util.HashMap;

public class subarraywithsumk {
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(countSubarrays(arr, k)); // Output: 2
    }
    public static int countSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {
            prefixSum += num;

            System.out.println("data sub:"+(prefixSum - k));

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
                System.out.println(count);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            System.out.println(map);
        }

        return count;
    }
}
