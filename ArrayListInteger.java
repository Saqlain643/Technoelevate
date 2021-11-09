package com.technoelevate.sampleprograms.testprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInteger {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add(10);
		arrayList.add("hi");
		arrayList.add(21);
		arrayList.add("hello");
		arrayList.add(32);
		arrayList.add("hlw");
		arrayList.add(43);
		
		Iterator<Integer> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			//if(iterator.next()==Integer) {
				System.out.println(iterator.next());
			//}
		}
	}
}
