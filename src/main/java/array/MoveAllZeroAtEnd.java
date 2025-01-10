package array;

import java.util.Arrays;

public class MoveAllZeroAtEnd {
	public static void main(String[] args) {
		int[] a = { 1, 0, 7, 0, 4, 0, 5, 0 };
		int[] f = new  int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				f[j]=a[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(f));
	}

}
