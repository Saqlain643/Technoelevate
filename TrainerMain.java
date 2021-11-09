package com.technoelevate.sampleprograms.testprograms;

import java.util.ArrayList;
import java.util.Collections;

public class TrainerMain {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add(new Trainer("PraveenSir", "3years", 11));
		arrayList.add(new Trainer("BharatSir", "2years", 19));
		arrayList.add(new Trainer("RudraSir", "1years", 12));
		arrayList.add(new Trainer("DiptiMam", "6years", 14));
		arrayList.add(new Trainer("MeghaMam", "7years", 15));
		
		//for ascending
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		//for descending
		TrainerComparator comparator=new TrainerComparator();
		Collections.sort(arrayList,comparator);
		System.out.println(arrayList);
	}
}
