import java.util.HashMap;
import java.util.Map;

public class repeatedString {
    public static void main(String[] args) {

        String name = "geeksforgeeks";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : name.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        System.out.println(map);
        char maxChar = '\0';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        Map<Character, Integer> result = new HashMap<>();
        result.put(maxChar, maxCount);
        System.out.println(result);
    }
}
