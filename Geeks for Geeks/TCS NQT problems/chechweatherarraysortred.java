import java.util.Arrays;

public class chechweatherarraysortred {
    public static void main(String[] args) {
        
        int [] arr={10,20,30,40,50};

        int [] test = new int[arr.length];

        for(int i =0;i<test.length;i++){
           test[i] = arr[i];
        }
        
        Arrays.sort(test);

        for(int i =0;i<test.length;i++){
             if(arr[i]!=test[i]){
                System.out.println("false");
            }
        }
        
        System.out.println("true");
    }
}
