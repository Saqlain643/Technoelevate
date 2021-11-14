package com.technoelevate.assignment2;

import java.util.TreeMap;

public class TreeMapForEach {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap=new TreeMap();
		treeMap.put(1, "iphone");
		treeMap.put(2,"nokia");
		treeMap.put(3, "mi");
		treeMap.put(4, "samsung");
		treeMap.put(5, "oppo");
		
		treeMap.forEach((k,v)->{System.out.println("Key="+k +" "+"Value="+v);});
	}
}
