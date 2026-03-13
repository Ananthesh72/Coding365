import java.util.ArrayList;

public class generate_ip_address {
    public static void main(String[] args) {
        
        String s= "11211";

        ArrayList<String> result = gen_ip(s);
        System.out.println(result);

    }

    public static ArrayList<String> gen_ip(String s){
        ArrayList<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, int index, ArrayList<String> current, ArrayList<String> result) {
        if (current.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }

        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length()) break;
            String part = s.substring(index, index + len);
            if (isValid(part)) {
                current.add(part);
                backtrack(s, index + len, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isValid(String part) {
        if (part.length() > 1 && part.charAt(0) == '0') return false;
        int num = Integer.parseInt(part);
        return num >= 0 && num <= 255;
    }
}
