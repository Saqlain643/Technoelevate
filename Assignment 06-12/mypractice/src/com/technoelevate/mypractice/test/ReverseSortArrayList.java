package com.technoelevate.mypractice.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseSortArrayList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(42);
		list.add(4522);
		list.add(742);
		list.add(202);
		list.add(802);
		list.add(452);
//		Collections.sort(list, Comparator.reverseOrder());
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println(list);
		
		
	}
}
