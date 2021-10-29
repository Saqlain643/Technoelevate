package com.technoelevate.basicprograms.methodoverloading;

import java.util.Scanner;

public class OwnerServant {
	static int owner(int money,int price) {
		System.out.println("Owner gives Rs."+money+" to the servant");
		int res=servant(money,price);
		return res;	
	}
	static int servant(int money, int price) {
		System.out.println("Servent buys some stuff of price Rs "+price);
		int rMoney=money-price;
		return  rMoney;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the money you give");
		int money=sc.nextInt();
		System.out.println("Enter the price of the product");
		int price=sc.nextInt();
		int res=owner(money,price);
		System.out.println("Returns the remaning money Rs "+res);
		sc.close();
	}
}