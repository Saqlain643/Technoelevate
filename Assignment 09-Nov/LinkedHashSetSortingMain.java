package com.technoelevate.sampleprograms.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetSortingMain {
	public static void main(String[] args) {
		LinkedHashSet<Student> hashSet=new LinkedHashSet<>();
		hashSet.add(new Student(1, "Saqlain"));
		hashSet.add(new Student(77, "Mirza"));
		hashSet.add(new Student(231, "Jellal"));
		hashSet.add(new Student(14, "Kenny"));
		hashSet.add(new Student(5, "Levi"));
		
		ArrayList<Student> arrayList=new ArrayList<Student>(hashSet); 
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		StudentComparator comparator=new StudentComparator();
		Collections.sort(arrayList,comparator);
		System.out.println(arrayList);
	}
}
