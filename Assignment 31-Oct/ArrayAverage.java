package com.technoelevate.javabasics.assignment1;

import java.util.*;

public class ArrayAverage {
	public static double calculateAverage(int[] arr) {
		int sum=0;
		double avg=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(calculateAverage(arr));
		sc.close();
	}
}
