package com.technoelevate.sampleprograms.testprograms;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a= {10,2,30,4,33};
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}
			}
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
