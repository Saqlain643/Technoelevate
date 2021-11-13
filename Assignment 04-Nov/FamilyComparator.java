package com.technoelevate.sampleprograms.testprograms;

import java.util.Comparator;

public class FamilyComparator implements Comparator<Family> {

	@Override
	public int compare(Family o1, Family o2) {
		return o2.relation.compareTo(o1.relation);
	}
	
}
