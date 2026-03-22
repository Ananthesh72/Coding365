public class encryptString {
    public static void main(String[] args) {
        System.out.println(EncryptString("aabaac")); // Output: 1c2a1b2a
    }


    public static String EncryptString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int count = 0;

            while (i < n && s.charAt(i) == ch) {
                count++;
                i++;
            }
            i--;
            sb.append(ch);
            sb.append(count);
            // System.out.println(sb);
        }

        return sb.reverse().toString();
    }
}
