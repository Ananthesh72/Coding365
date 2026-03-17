public class meanofarray {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 2, 6, 5, 8, 7 };
        if (arr.length == 0) return;
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        int mean = sum / arr.length;

        System.out.println(mean);
    }
}
