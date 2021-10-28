package com.technoelevate.basicprograms.methodoverloading;

public class Child extends Parent implements Parent2{
	void display() {
		System.out.println("Child");
	}
	public void disp() {
		System.out.println("Mother");
	}
}