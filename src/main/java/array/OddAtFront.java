package array;

import java.util.Arrays;

public class OddAtFront {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int[] aa = new int[a.length];
        int j=0;
        for(int n : a){
            if(n%2!=0){
                aa[j]=n;
                j++;
            }
        }
//for even
        for(int n : a){
            if(n%2==0){
                aa[j]=n;
                j++;
            }
        }

        System.out.println(Arrays.toString(aa));

    }
}
