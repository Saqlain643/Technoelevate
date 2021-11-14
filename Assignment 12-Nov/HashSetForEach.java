package com.technoelevate.assignment2;

import java.util.HashSet;

public class HashSetForEach {
	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		hashSet.add("audi");
		hashSet.add("tesla");
		hashSet.add("bmw");
		hashSet.add("mercedes");
		hashSet.add("lamborghini");
		
		hashSet.forEach(l->{System.out.println(l+" car");});
	}
}
