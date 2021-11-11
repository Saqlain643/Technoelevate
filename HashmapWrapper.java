package com.technoelevate.collectionmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapWrapper {
	static Map<Integer, Object> map = new HashMap<Integer, Object>();

	public static void sortbykey() {
		TreeMap<Integer, Object> sorted = new TreeMap<Integer, Object>();

		sorted.putAll(map);

		for (Map.Entry<Integer, Object> entry : sorted.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

	public static void main(String[] args) {
		map.put(10, "Hello");
		map.put(20, "World");
		map.put(130, "Program");
		map.put(5010, "in");
		map.put(11, "Java");
		map.putAll(map);
		sortbykey();
	}
}
