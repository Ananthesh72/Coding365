
public class Leetcode_70 {

    public int climb_starirs(int n){

        if(n<=2){
            return n;
        }

        int first = 1;
        int second = 2;

        for(int i=3;i<n;i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    public static void main(String[] args) {
        int n=5;
        Leetcode_70 cs = new Leetcode_70();
        System.out.println(cs.climb_starirs(n));

    }
}
