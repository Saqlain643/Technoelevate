package com.technoelevate.javabasics.constructor;

public class SuperMethodExampleChild extends SuperMethodExample {

	public SuperMethodExampleChild(int i) {
		super(10,"Saqlain");
		System.out.println("Child Class Constructor");
	}
	public static void main(String[] args) {
		SuperMethodExampleChild superMethodExampleChild=new SuperMethodExampleChild(45);
	}
}
