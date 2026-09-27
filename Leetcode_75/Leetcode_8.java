// 8. String to Integer (atoi)
public class Leetcode_8 {
    public static int myAtoi(String s) {
        s = s.strip();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int index = 0;

        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        int result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit > 8)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        // System.out.println(a.myAtoi(" -42")); // Output: -42
        System.out.println(myAtoi("-4193 with words")); // Output: 4193
        // System.out.println(a.myAtoi("words and 987")); // Output: 0
        // System.out.println(a.myAtoi("-91283472332")); // Output: -2147483648
        // System.out.println(a.myAtoi("91283472332")); // Output: 2147483647
    }
}