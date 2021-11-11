package com.technoelevate.collectionmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapUserDefined {
	static Map<Object, Integer> map = new HashMap<Object, Integer>();

	public static void sortbykey() {
		TreeMap<Object, Integer> sorted = new TreeMap<Object, Integer>();

		sorted.putAll(map);

		for (Map.Entry<Object, Integer> entry : sorted.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

	public static void main(String[] args) {
		map.put("Hello",10);
		map.put("World",20);
		map.put("Java",20);
		map.put("Program",20);
		map.put("Thanks",20);
		//map.putAll(map);
		sortbykey();
	}
}
