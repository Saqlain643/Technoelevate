package com.technoelevate.javabasics.assignment3;

import java.util.Scanner;
/*
 * Whenever you take inputs from the user using a Scanner class.
 * If the inputs passed doesn’t match the method or an InputMisMatchException is thrown.
 * For example, if you reading an integer data using the nextInt() method and the value passed in a String then, 
 * an exception occurs
 */
public class InputMismatchExceptionExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		System.out.println(a+b);
	}
	
}
