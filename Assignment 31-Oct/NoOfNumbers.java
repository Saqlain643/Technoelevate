package com.technoelevate.javabasics.assignment1;

import java.util.Scanner;

public class NoOfNumbers {
	public static int[] calculate(int[] arr) {
		int even=0,odd=0,pnum=0,nnum=0,zero=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zero++;
			}
			else if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
			if(arr[i]>0){
				pnum++;
			}
			else if(arr[i]<0) {
				nnum++;
			}
		}
		int[] res= {even,odd,zero,pnum,nnum};
		return res;
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
		int[] res=calculate(arr);
		System.out.println("Even numbers="+res[0]);
		System.out.println("Odd numbers="+res[1]);
		System.out.println("Zeroes="+res[2]);
		System.out.println("Positive numbers="+res[3]);
		System.out.println("Negative numbers="+res[4]);
		sc.close();
	}
}