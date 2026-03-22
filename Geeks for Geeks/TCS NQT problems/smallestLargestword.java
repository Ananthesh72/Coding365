import java.util.ArrayList;
import java.util.Arrays;

public class smallestLargestword {
    public static void main(String[] args) {

        String s = "water WATER evEry WHere BUT nor a Drop to Drink FUILD";
        // String s = "Lp lp";
        String[] words = s.trim().split("\\s+");
        String smallest = words[0];
        String largest = words[0];

        int minlen =words[0].length();
        int maxlen =words[0].length();
        for (String str : words) {
            minlen = Math.min(minlen,str.trim().length());
            maxlen = Math.max(maxlen,str.trim().length());
        }
        // System.out.println("minlen:-"+minlen+"|maxlen:-"+maxlen);
        int mincount=0;
        
        for (String str : words) {

            if (mincount != 1){
                if(minlen == str.trim().length()){
                    smallest = str;
                    mincount++;
                }
            }
            if(maxlen == str.trim().length()){
                largest = str;
            }
        }
        ArrayList<String> newarr = new ArrayList<>();
        newarr.add(smallest);
        newarr.add(largest);

        System.out.println("smallest:-"+smallest+ "| largest:-"+largest);

    }
}
