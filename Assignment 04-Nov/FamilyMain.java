package com.technoelevate.sampleprograms.testprograms;

import java.util.ArrayList;
import java.util.Collections;

public class FamilyMain {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add(new Family(52, "Muktar", "Father"));
		arrayList.add(new Family(47, "Anjum", "Mother"));
		arrayList.add(new Family(32, "Taher", "Elder Brother"));
		arrayList.add(new Family(29, "Sadiq", "Younger Brother"));
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		FamilyComparator familyComparator=new FamilyComparator();
		Collections.sort(arrayList,familyComparator);
		System.out.println(arrayList);
	}
}
