package com.technoelevate.javabasics.assignment2;

import java.util.Scanner;

public class Recursion {
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		fact=factorial(n);
		System.out.println(fact);
		sc.close();
	}
}
