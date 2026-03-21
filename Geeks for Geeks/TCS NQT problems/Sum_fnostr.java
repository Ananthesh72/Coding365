import java.util.regex.*;
public class Sum_fnostr {
    public static void main(String[] args) {
        String s = "1abc23";
        int sum =0;
        Pattern  pt = Pattern.compile("\\d+");
        Matcher m = pt.matcher(s);
        // System.out.println(m.find());

        while(m.find()){
            sum +=Integer.parseInt(m.group());
        }
        System.out.println(sum);
    }
}
