import java.util.HashMap;
import java.util.Map;

public class Leetcode_3 {

    public static void main(String[] args) {

        String str = "abcabcbb";
        // String str = "bbbbb";
        // String str = "pwwkew";

        int i = lengthOfLongestSubstring(str);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {

        int count = 0;
        int l = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {

            char word = s.charAt(r);

            if (map.containsKey(word)) {
                l = Math.max(l, map.get(word) + 1);
            }

            map.put(word, r);
            count = Math.max(count, r - l + 1);
            System.out.println(count);
            
        }
        return count;
    }

}
