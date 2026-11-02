public class Leetcode_458 {
    
    public static void main(String[] args) {
        
        int buckets = 4;
        int minutestoDie=15;
        int minutestoTest=15;
        
        System.out.println(poorPigs(buckets,minutestoDie,minutestoTest));
    }



    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs=0;
        
        while(Math.pow(minutesToTest / minutesToDie +1, pigs) < buckets)
            pigs +=1;

        return pigs;
    }
}
