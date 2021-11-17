package com.technoelevate.studentmanagement;

import java.util.Comparator;

public class SortByGender implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getGender().compareTo(o2.getGender());
	}

}
