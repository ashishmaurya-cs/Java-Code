package array;

import java.util.Arrays;

public class LargestElement {
    public static int getLargest(int[] arr) {
        // Code Here
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }


    public static void main(String[] args) {
        int[] a = {10,10,10};
        System.out.println(getLargest(a));
    }
}

