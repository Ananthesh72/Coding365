import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class minAnd2ndMin {
    public static void main(String[] args) {

        int [] arr = {2, 4, 3, 5, 6};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < first) {
                second = first;
                first = i;
            } else if (i < second && i != first) {
                second = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        // If second stayed as MAX_VALUE, it means no second distinct min exists
        if (second == Integer.MAX_VALUE) {
            result.add(-1);
        } else {
            result.add(first);
            result.add(second);
        }
        // return result;
        System.out.println(result);

    }
}
