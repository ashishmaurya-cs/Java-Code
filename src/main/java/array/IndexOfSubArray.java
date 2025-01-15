package array;

import java.util.ArrayList;

public class IndexOfSubArray {
    //find the index of subarray which is equal to or greater than target
    // if not then return 1

    public static ArrayList<Integer> findIndex(int[] a, int target) {
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (sum == target) {
                    index.add(i);
                    index.add(j);
                    return index;
                }
            }
        }

        index.add(-1);
        return index;
    }

    public static void main(String[] args) {
        int[] a = {20, 2, 3, 4, 9, 7, 8, 10};
        int target = 7;
        System.out.println(findIndex(a, target));
    }
}
