import java.util.HashMap;
import java.util.Map;

public class Leetcode_3 {
    
    public static void main(String[] args) {

        String str ="pwwkew";

        int i =lengthOfLongestSubstring(str);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> lastSeen = new HashMap<>();

    int left = 0;
    int longest = 0;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);

        if (lastSeen.containsKey(c)) {
            left = Math.max(left, lastSeen.get(c) + 1);
        }

        lastSeen.put(c, right);
        longest = Math.max(longest, right - left + 1);

        System.out.println(lastSeen);
    }

    return longest;
    }

}
