package array;

public class ElementSearch {
	
	public static int  searchElement(int[] a, int n) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				return a[i];
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,10};
		System.out.println(searchElement(a, 10));
	}

}
