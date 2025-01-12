package array;

import java.util.Arrays;

public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int n=arr.length;
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] a = {10,10,10};
        System.out.println(getSecondLargest(a));
    }
}
