package com.technoelevate.collectionmap;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapAddElement {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(4, "Saqlain");
		hashMap.put(2, "Indra");
		hashMap.put(5, "Jaydeep");
		hashMap.put(1, "Jyoti");
		hashMap.put(3, "Pravat");

		TreeMap<Integer, String> map = new TreeMap<Integer, String>(hashMap);
		System.out.println(map);
	}
}
