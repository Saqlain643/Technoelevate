package com.technoelevate.sampleprograms.testprograms;

import java.util.ArrayList;
import java.util.Collections;

public class CollegueMain {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add(new Collegue(52, "Nitish", "Friend"));
		arrayList.add(new Collegue(47, "Abc", "Not Friend"));
		arrayList.add(new Collegue(32, "Xyz", "Just Friend"));
		arrayList.add(new Collegue(29, "Sadiq", "Brother"));
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		CollegueComparator comparator=new CollegueComparator();
		Collections.sort(arrayList,comparator);
		System.out.println(arrayList);
	}
}
