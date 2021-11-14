package com.technoelevate.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetForEachSort {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(55);
		set.add(80);
		set.add(877);
		set.add(134);
		set.add(11);
		ArrayList arr = new ArrayList(set);
		Collections.sort(arr);
		arr.forEach(itr -> System.out.print(itr + " "));
	}
}
