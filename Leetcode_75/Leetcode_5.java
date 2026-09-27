import java.util.HashMap;

public class Leetcode_5{

    public static void main(String[] args) {


        String s = "babad";
        int l=0;
        int r= s.length() -1;
        int pali_chk =0;

        while( r >= l){
            if(s.charAt(l) == s.charAt(r)){
                pali_chk++;
            }
            l++;
            r--;
        }
        System.out.println(s.substring(0,pali_chk));
        
    }
}