import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class rmduplicsortedarray {
    public static void main(String[] args) {
        int[]  arr={10,23,23,27,27,32,37,48,54,66,66,90,91,91};

        LinkedHashSet <Integer> res = new LinkedHashSet<Integer>();
        for(int i : arr){
            res.add(i);
        }
        ArrayList<Integer> newres = new ArrayList<>(res);
        System.out.println(newres);



    }
}
