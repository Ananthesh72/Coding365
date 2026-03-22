import java.util.Arrays;

public class sortstring {
    public static void main(String[] args) {
        
        String input = "dcba";
        char [] chars = input.toCharArray();
        Arrays.sort(chars);

        String str = new String(chars);
        System.out.println(str);
    }
}
