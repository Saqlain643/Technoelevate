package com.technoelevate.collectionarraylist.myownimplmentationofarraylist;

import java.util.Iterator;

public class MyArrayList implements Iterable {
	private int position;
	private Object[] array;

	public MyArrayList(int arraySize) {
		array = new Object[arraySize];
	}

	public void add(Object obj) {
		if(position>=size()) {
			grow();
		}
		array[position++] = obj;
	}

	public Object get(int index) {
		return array[index];
	}

	public int size() {
		return array.length;
	}

	@Override
	public String toString() {
		if (size() == 0) {
			return "[]";
		}
		String string = "[" + array[0];
		for (int i = 1; i < size(); i++) {
			string += "," + array[i];
		}
		string += "]";
		return string;
	}
	public void grow() {
		Object[] temp=new Object[array.length+10];
		System.arraycopy(array, 0, temp, 0, array.length);
		array=temp;
	}

	@Override
	public Iterator iterator() {
		
		return new Itr();
	}
	private class Itr implements Iterator{
		int index;
		@Override
		public boolean hasNext() {
			
			return (index<position)?true:false;
		}

		@Override
		public Object next() {
			
			return array[index++];
		}
	}
}