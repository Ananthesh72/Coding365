
// package Geeks for Geeks.TCS NQT problems;
import java.util.HashMap;

public class non_reapeating_elements {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -1, 3, 2 };

        non_reapeating_elements obj = new non_reapeating_elements();
        System.out.println(obj.firstNonRepeating(arr));
    }

    public int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : arr) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
