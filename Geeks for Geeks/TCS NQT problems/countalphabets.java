import java.util.regex.*;
public class countalphabets {

    public static void main(String[] args) {
        String str ="adjfjh23";
        
        Pattern pt = Pattern.compile("[a-zA-Z]");
        Matcher mc = pt.matcher(str);
        int count=0;
        while(mc.find()){
            count++;
        }
        System.out.println(count);
    }
}