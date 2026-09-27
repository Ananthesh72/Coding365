import java.util.*;

public class Leetcode_10 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println(RegularExpression(sc.nextLine(),sc.next()));
    }

    static Boolean RegularExpression (String str, String pattern){


        if(str.length() == 0 && pattern.length() == 0)
            return false;

        if(str.isEmpty() && pattern.contains(".*"))
            return true;

        if(str.equals(pattern)){
            return true;
        }

        
        return false;
    }
}
