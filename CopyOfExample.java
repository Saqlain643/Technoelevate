package com.technoelevate.javabasics.Assignment1;

public class CopyOfExample {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,10,20,30};
		int count=0;
		for (int i=0; i<arr.length-1; i++){ 
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
         }
	}
}
