package com.technoelevate.javabasics.assignment3;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first operands:");
		int a=sc.nextInt();
		System.out.println("Enter which operation:\n1. + \n2. - \n3. * \n4. /");
		int exp=sc.nextInt();
		System.out.println("Enter second operands:");
		int b=sc.nextInt();
		sc.close();
		switch(exp) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid input");	
		}
	}
}
