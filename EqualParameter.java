package com.technoelevate.javabasics.Assignment1;

import java.util.Scanner;

public class EqualParameter {
	public static void printEqual(int a,int b,int c) {
		if(a==0 || b==0 || c==0)
			System.out.println("Invalid value");
		else if(a==b && a==c)
			System.out.println("All numbers are equal");
		else if(a!=b && b!=c && c!=a)
			System.out.println("All numbers are different");
		else {
			System.out.println("Neither all are equal or different");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		printEqual(a,b,c);
		sc.close();
	}

}
