package com.technoelevate.sampleprograms.testprograms;

import java.util.Comparator;

public class Family implements Comparable<Family> {
	int age;
	String name,relation;
	public Family(int age, String name, String relation) {
		super();
		this.age = age;
		this.name = name;
		this.relation = relation;
	}
	@Override
	public String toString() {
		return "Family [age=" + age + ", name=" + name + ", relation=" + relation + "]";
	}
	@Override
	public int compareTo(Family o) {
		return this.relation.compareTo(o.relation);
	}
	
}
