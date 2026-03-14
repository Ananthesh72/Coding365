package Leetcode_75;
import java.util.*;
public class Divide_String_into_k_2139 {
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        String fill = "x";
        String [] result  = divideString(s, k, fill);
        System.out.println(Arrays.toString(result));
    }
    public  static String[] divideString(String s, int k, String fill) {
        List<String> result = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n; i += k) {
            String group = s.substring(i, Math.min(i + k, n));
            while (group.length() < k) {
                group += fill;
            }
            result.add(group);
        }
        return result.toArray(new String[0]);
    }
}
