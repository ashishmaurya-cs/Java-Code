package array;

import java.util.ArrayList;

public class ArrayLeaders {
//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
static ArrayList<Integer> leaders(int arr[]) {
	// code here
	ArrayList<Integer> leader = new ArrayList<>();
	int len = arr.length;


	leader.add(arr[arr.length-1]);

	if(len==0){
		return leader;
	}

	int maxright=arr[len-1];
	for(int i=arr.length-2;i>0;i--){
		if(arr[i]>=maxright){
			maxright=arr[i];
			leader.add(maxright);
		}
	}

	ArrayList<Integer> finals = new ArrayList<>();

	for(int i=leader.size()-1;i>=0;i--){
		finals.add(leader.get(i));
	}
	return finals;
}
	public static void main(String[] args) {
	int[] a = {7,4,2,9,11,3};
		System.out.println(leaders(a));
		
	}
}
