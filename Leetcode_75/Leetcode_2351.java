import java.util.HashSet;

public class Leetcode_2351{

    public static void main(String[] args) {
        String str ="abccbaacz";

        System.out.println(repeatedCharacter(str));

    }

    public  static char repeatedCharacter(String s) {
        
        HashSet<Character> h = new HashSet<>();
        
        for(char ch : s.toCharArray()){
            if(h.contains(ch)){
                return ch;
            }

            h.add(ch);
        }
        return 0;

    }

}

