package com.technoelevate.javabasics.Assignment1;

public class ForStatement {
	public static void main(String[] args) {
		int sum=0,count=0;
		for(int i=1;i<=1000 && count<=5;i++) {
			if(i%3==0 && i%5==0) {
				count++;
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
