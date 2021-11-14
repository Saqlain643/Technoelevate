package com.technoelevate.assignment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysCollections {
	public static void main(String[] args) {
		String[] a = { "Hello", "world", "program", "in", "java" };
		List<String> list = Arrays.asList(a);
		Collections.sort(list);
		list.forEach(arr -> System.out.println(arr));
	}
}
