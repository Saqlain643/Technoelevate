package com.technoelevate.studentmanagement;

import java.util.Comparator;

public class SortByNumber implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		long sub = o1.getPhoneNumber() - o2.getPhoneNumber();
		if (sub > 0)
			return 1;
		else if (sub < 0)
			return -1;
		else
			return 0;
	}

}
