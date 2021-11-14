package com.technoelevate.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());

		list.add("hello");
		list.add("world");
		list.add("program");

		synchronized (list) {
			Iterator it = list.iterator();

			while (it.hasNext())
				System.out.println(it.next());
		}
	}
}
