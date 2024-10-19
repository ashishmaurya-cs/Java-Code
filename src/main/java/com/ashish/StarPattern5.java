package com.ashish;

public class StarPattern5 {

public static void main(String[] args) {
	int c = 65;
	for(int i=1;i<=5;i++)
	{
		for (int j = 1; j <= 5; j++) {
			if (i >= 6-j) {
				System.out.print((char)c+" ");
				c++;
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

}
