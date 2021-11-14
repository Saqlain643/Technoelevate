package com.technoelevate.assignment2;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapStoreInTreeMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(12, "Jynx");
		hashMap.put(47, "Treeko");
		hashMap.put(7, "Lapras");
		hashMap.put(24, "Gyrados");
		hashMap.put(33, "Tauraus");

		TreeMap<Integer, String> map = new TreeMap<Integer, String>(hashMap);

		map.forEach((k, v) -> {
			System.out.println("key=" + k + " " + "value=" + v);
		});
	}
}
