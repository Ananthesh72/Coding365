import java.util.regex.*;
public class summultipledigit {
    public static void main(String[] args) {
        String s = "1abc23";
        int sum =0;
        Pattern pt = Pattern.compile("\\d+");
        Matcher mc = pt.matcher(s);
        // System.out.println(mc.find());
        while(mc.find()){
            sum += Integer.parseInt(mc.group());
        }
        System.out.println(sum);
    }
}
