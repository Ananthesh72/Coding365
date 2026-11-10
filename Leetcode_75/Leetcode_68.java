import java.util.ArrayList;
import java.util.List;

public class Leetcode_68 {

    public static void main(String[] args) {

        String[] words = { "This", "is", "an", "example", "of", "text", "justification." };

        // String str = "This is an";
        // System.out.println( str.length());
        List<String> data = new ArrayList<>();

        data = fullJustify(words, 16);

        System.out.println(data);

    }


    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0, n = words.length;

        while (i < n) {
            int lineLength = words[i].length();
            int j = i + 1;
            
            while (j < n && lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length();
                j++;
            }

            int numWords = j - i;
            StringBuilder sb = new StringBuilder();

            if (j == n || numWords == 1) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1)
                        sb.append(" ");
                }
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            }
            else {
                int totalWordChars = 0;
                for (int k = i; k < j; k++) {
                    totalWordChars += words[k].length();
                }

                int totalSpaces = maxWidth - totalWordChars;
                int gaps = numWords - 1;
                int baseSpaces = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        int spacesToApply = baseSpaces + (k - i < extraSpaces ? 1 : 0);
                        sb.append(" ".repeat(spacesToApply));
                    }
                }
            }

\            result.add(sb.toString());
            i = j; // Move to the next batch of words
        }

        return result;
    }

}