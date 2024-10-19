package com.ashish;

public class PrimeNumberCheck {
	
	public static boolean isPrime(int n) {
		boolean flag = false;
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		return flag;
	}
public static void main(String[] args) {
	boolean f = isPrime(6);
	if(f) {
		System.out.println("Not a prime number");
	}
	else {
		System.out.println("prime number");
	}
}
}
