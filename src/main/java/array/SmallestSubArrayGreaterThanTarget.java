package array;

import java.util.ArrayList;

public class SmallestSubArrayGreaterThanTarget {
    //find the index of subarray which is greater than target
    // if not then return 0

    public static ArrayList<Integer> findIndex(int[] a, int target) {
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (sum > target) {
                    index.add(i);
                    index.add(j);
                    return index;
                }
            }
        }

        index.add(0);
        return index;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 8, 10};
        int target = 100;
        System.out.println(findIndex(a, target));
    }
}

