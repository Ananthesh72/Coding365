import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {

        int[] arr = { 1, 5, 3, 2 };
        // Arrays.sort(arr);
        //Bubble sort 
        // System.out.println(Arrays.toString(arr));
        // int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - 1 - i; j++) {

        // if(arr[j] > arr[j+1]){
        // int temp = arr[j];
        // arr[j] = arr[j+1];
        // arr[j+1] = temp;
        // }
        // }
        // }
        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
