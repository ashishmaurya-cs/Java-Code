package array;

public class MissingElementInArray {
public static void main(String[] args) {
	int[] a = {1,2,3,4,6,7,8};
	
	int size = a.length+1;
	int sum = size*(size+1)/2;
	
	System.out.println(sum);
	
	int actualSum = 0;
	for(int i=0;i<a.length;i++) {
		actualSum = actualSum +a[i];
	}
	
	System.out.println("Actual sum: "+actualSum);
	int missing = sum-actualSum;
	System.out.println(missing);
}
}
