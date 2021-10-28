package com.technoelevate.basicprograms.methodoverloading;


public class MethodOverloadingExp {
	public int sum(int a,int b) {
		return a+b;
	}
	public long sum(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodOverloadingExp methodOverloadingExp=new MethodOverloadingExp();
		System.out.println(methodOverloadingExp.sum(10, 20));
		System.out.println(methodOverloadingExp.sum(10, 20, 30));	
	}
}

