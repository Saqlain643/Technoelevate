package com.technoelevate.sampleprograms.testprograms;

//import java.util.Arrays;

public class ArrayDeletion {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 77, 99, 77, 42 };
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		int n = arr.length;
		int len = duplicateDelete(arr, n);
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int duplicateDelete(int[] arr, int n) {
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j;
	}
}
