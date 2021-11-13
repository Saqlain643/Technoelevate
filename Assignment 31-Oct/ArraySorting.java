package com.technoelevate.javabasics.assignment1;
import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		String[] arr= {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
