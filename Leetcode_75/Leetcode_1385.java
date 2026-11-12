public class Leetcode_1385 {
    public static void main(String[] args) {
        

int[] arr1 = new int[]{2, 1, 100, 3};
int[] arr2 = new int[]{-5, -2, 10, -3, 7};
int d = 6;

    System.out.println(findTheDistanceValue(arr1, arr2, d));
        
    }


    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int x : arr1){
            boolean valid= true;
            for(int y: arr2){
                if(Math.abs( x - y ) <= d){
                    valid =false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}
