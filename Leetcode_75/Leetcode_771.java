
public class Leetcode_771 {

    // Jewels and Stones
    public static void main(String[] args) {

        String jewels = "azz", stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels,stones));
    }


    public static int numJewelsInStones(String jewels, String stones) {
        
        // HashSet<Character> pool = new HashSet<>();

        //     for(char c : jewels.toCharArray()){
        //         pool.add(c);
        //     }

        //     int count =0;
        //     for(char ch : stones.toCharArray()){
        //         if(pool.contains(ch)){
        //             count++;
        //         }
        //     }
        // return count;
        int count =0;

        boolean [] b = new boolean[128];

        for(char c : jewels.toCharArray()){
            b[c]= true;
        }

        for(char ch : stones.toCharArray()){
            if(b[ch]){
                count++;
            }
        }

        return count;
    }
}
