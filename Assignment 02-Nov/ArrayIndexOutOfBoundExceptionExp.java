package com.technoelevate.javabasics.assignment3;

public class ArrayIndexOutOfBoundExceptionExp {
	public static void main(String[] args) {
		String[] words=new String[5];
		words[0]="Hello";
		words[1]="World";
		words[5]="Exception here";
	}
}
