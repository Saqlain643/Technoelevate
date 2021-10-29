package com.technoelevate.javabasics.constructor;

public class ThisExample {

	public ThisExample() {
		System.out.println("no param consructor");
	}
	
	public ThisExample(int i) {
		this();
		System.out.println("consructor with one parameter");
	}
	public ThisExample(int i,float f) {
		this(i);
		System.out.println("consructor with two parameter");
	}
	public static void main(String[] args) {
		ThisExample thisExample=new ThisExample(10,5.6f);
	}
}
