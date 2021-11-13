package com.technoelevate.javabasics.assignment2;

public class Circle extends Area {
	@Override
	void area(int radius) {
		System.out.println("Area of Circle "+3.141*radius*radius);
	}
}
