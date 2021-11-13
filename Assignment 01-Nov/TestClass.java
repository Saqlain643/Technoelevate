package com.technoelevate.javabasics.assignment2;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FactoryClass factoryClass1=new FactoryClass();
		System.out.println("Select the browser from the given option:");
		System.out.println("1.Dhananjay\n 2.Balla\n 3.Parag\n 4.Nitish\n");
		System.out.println("Please enter your selection");
		int ch=sc.nextInt();
		sc.close();
		switch(ch) {
		case 1: factoryClass1.getCollegue("dhananjay").properties();
				break;
		case 2: factoryClass1.getCollegue("balla").properties();
				break;
		case 3: factoryClass1.getCollegue("parag").properties();
				break;
		case 4: factoryClass1.getCollegue("nitish").properties();
				break;
		default:
			System.out.println("Invalid");
		}
	}
}
