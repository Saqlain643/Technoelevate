package com.technoelevate.sampleprograms.testprograms;

import java.util.Comparator;

public class CollegueComparator implements Comparator<Collegue> {

	@Override
	public int compare(Collegue o1, Collegue o2) {
		return o2.relation.compareTo(o1.relation);
	}

}
