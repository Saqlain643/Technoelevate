package com.technoelevate.javabasics.Assignment1;

public class Area {
	static double area(double radius) {
		if(radius>=0)
			return 3.141*radius*radius;
		else
			return -1.0;
	}
	static double area(double x,double y) {
		if(x>=0 && y>=0)
			return x*y;
		else
			return -1.0;
	}
	public static void main(String[] args) {
		System.out.println("Area of Circle:"+area(12.6));
		System.out.println("Area of Rectangle:"+area(12.6,-6.2));
	}
}
