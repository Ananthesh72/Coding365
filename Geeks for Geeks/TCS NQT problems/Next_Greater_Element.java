import java.util.ArrayList;

public class Next_Greater_Element {
    public static void main(String[] args) {
        
        int [] arr = {1, 3, 2, 4};//[3, 4, 4, -1]
        Next_Greater_Element obj = new Next_Greater_Element();
        System.out.println(obj.nextLargerElement(arr));
    }


    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int curr = 0;
        int prev = 0;
        int max=0;
        ArrayList<Integer> newarr = new ArrayList<>();
        for(int i =1;i<arr.length-1;i++){
             max = Math.max(arr[i], arr[i+1]);
            System.out.println(max);
            if(max != prev){
                newarr.add(max);
                prev = max;
            }
            curr++;
        }
        newarr.add(max);
        newarr.add(-1);

        return newarr;
    }
}
