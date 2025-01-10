package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MultipleMissingElement {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 8, 9 };
		HashSet<Integer> hashSet = new  HashSet<Integer>();
		for(int n:a) {
			hashSet.add(n);
		}
		
		List<Integer> missing =  new  ArrayList<Integer>();
		
		for(int i=1;i<=9;i++) {
			if(!hashSet.contains(i)) {
				missing.add(i);
			}
		}
		
		System.out.println(missing.toString());
	}
}
