package array;

import java.util.Arrays;

public class RemoveDuplicateArray {
public static void main(String[] args) {
	int[] arr= {9,3,5,8,6,1,9,6,3};
	Arrays.sort(arr);
	
	int[] temp = new int[arr.length];
	int j=0;
	
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]!=arr[i+1]) {
			temp[j]=arr[i];
			j=j+1;
		}
	}
	
	temp[j]=arr[arr.length-1];
	
	System.out.println("j : "+ j);
	
	int[] newArr = Arrays.copyOf(temp, j+1);
	
	for(int i=0;i<newArr.length;i++) {
		System.out.println(newArr[i]);
	}
	
}
}
