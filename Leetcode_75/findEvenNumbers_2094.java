package Leetcode_75;
import java.util.*;

public class findEvenNumbers_2094 {

    public int [] findEvenNumbers(int[] digits) {
        int [] countdigits = new int[10];
        for(int c : digits){
            countdigits[c]++;
        }

        List <Integer> result = new ArrayList<>();

        for(int i=1;i< 10;i++){
            if(countdigits[i] == 0) continue;
            countdigits[i]--;

            for(int j =0 ;j <=9;j++){
                if(countdigits[j] == 0) continue;
                countdigits[j]--;

                for(int k =0;k <=9;k+=2){
                    if(countdigits[k] ==0) continue;
                    
                    int number = i*100 + j*10 + k;
                    result.add(number);
                }
                countdigits[j]++;
            }
            countdigits[i]++;
        }
        return result.stream().mapToInt(Integer :: intValue).toArray();
    }

    public static void main(String[] args) {
        findEvenNumbers_2094 obj = new findEvenNumbers_2094();
        int [] nums={2,1,3,0};
        System.out.println(obj.findEvenNumbers(nums));
    }
}
