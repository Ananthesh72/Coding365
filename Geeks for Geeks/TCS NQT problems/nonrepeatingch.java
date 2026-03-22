import java.util.HashMap;

public class nonrepeatingch {
    public static void main(String[] args) {
        
        String s ="geeksforgeeks";
        HashMap<Character,Integer> repeat = new HashMap<>()
        for(Character c : s.toCharArray()){
            repeat.put(c,repeat.getOrDefault(c, 0)+1);
        }  
        for(Character c: s.toCharArray()){
            if(repeat.get(c) ==1){
                System.out.println(c);
                break;
            }
        }
    }
}
