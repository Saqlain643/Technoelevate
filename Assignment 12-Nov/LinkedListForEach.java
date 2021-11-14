package com.technoelevate.assignment2;

import java.util.LinkedList;

public class LinkedListForEach {
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.add("mango");
		linkedList.add("apple");
		linkedList.add("oranges");
		linkedList.add("banana");
		linkedList.add("grapes");
		
		linkedList.forEach(l->{System.out.println(l+" fruit");});
	}
}
