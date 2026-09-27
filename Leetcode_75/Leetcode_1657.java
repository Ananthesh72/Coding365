import java.util.*;

public class Leetcode_1657 {

    public static void main(String[] args) {

        String s1 = "aabbcc";
        String s2 = "abcabc";
        System.out.println(closeString(s1,s2));
    }

    public static boolean closeString(String s1, String s2){

        if(s1.length()!=s2.length()) {
            return false;
        }
        HashMap<Character,Integer>map1 = new HashMap<>();
        HashMap<Character,Integer>map2 = new HashMap<>();
        for(char c:s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c : s2.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }

        int [] a = map1.values().stream().mapToInt(i->i).toArray();
        int [] b = map2.values().stream().mapToInt(i->i).toArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
        
    }
}
