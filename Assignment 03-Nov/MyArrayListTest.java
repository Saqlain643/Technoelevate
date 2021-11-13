package com.technoelevate.collectionarraylist.myownimplmentationofarraylist;

import java.util.Iterator;

public class MyArrayListTest {
	public static void main(String[] args) {
		MyArrayList arrayList = new MyArrayList(5);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(20);
		arrayList.add(20);
		arrayList.add(20);
		arrayList.add(20);

		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList);
		System.out.println("------using iterator------");
		Iterator iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
