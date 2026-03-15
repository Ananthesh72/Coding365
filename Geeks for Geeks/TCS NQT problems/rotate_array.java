// package Geeks for Geeks.TCS NQT problems;

import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {
        
        rotate_array obj = new rotate_array();
        // int [] a= {1, 2, 3, 4, 5};
        int [] a= {7, 3, 9, 1};
        obj.rotateArr(a,9);
        
    }

    void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d %= n;
        int [] newarr = new int[n];
        for(int i =d; i < n ;i++){
            newarr[i - d] = arr[i];
        }
        int count= 0;
        for(int j = n-d ;j<n;j++){
            newarr[j] = arr[count];
            count++;
        }   
        System.out.println(Arrays.toString(newarr));
    }

}

/*// package Geeks for Geeks.TCS NQT problems;

import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {
        
        rotate_array obj = new rotate_array();
        int [] a= {1, 2, 3, 4, 5};
        // int [] a= {7, 3, 9, 1};
        obj.rotateArr(a,2);
        System.out.println(Arrays.toString(a));
        
    }

    void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
 */