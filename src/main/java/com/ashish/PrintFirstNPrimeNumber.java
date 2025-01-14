package com.ashish;

import java.util.Scanner;

public class PrintFirstNPrimeNumber {
    public static boolean isPrime(int n) {
        if(n==1) return true;
        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term you want to print prime number");
        int term = sc.nextInt();
        int prime = 1;
        for (int i = 1; i < 10000; i++) {
            if (!isPrime(i) & prime<=term) {
                prime = prime + 1;
                System.out.print(i + " ");
            }
        }
    }
}

