package com.technoelevate.assignment2;

public class CarMain {
	public static void main(String[] args) {
		Car car=()->{
			System.out.println("1. Audi\n2. Model-12fd\n3. Color- White");
		};
		
		car.modelDisplay();
	}
}
