package com.ashish;

import java.util.Scanner;

public class FirstNFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term you want to print fibonacci series");
        int n= sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2);
        for(int i=0;i<n-2;i++){
            int next = n1+n2;
            n1=n2;
            n2=next;
            System.out.print(" "+next);
        }
    }
}
