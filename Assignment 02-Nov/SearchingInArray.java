package com.technoelevate.sampleprograms.testprograms;

public class SearchingInArray {
	public static void main(String[] args) {
		int[] a= {10,2,30,4,33};
		int ele=4;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				System.out.println(ele +" at index "+i);
			}
		}
	}
}
