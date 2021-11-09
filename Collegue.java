package com.technoelevate.sampleprograms.testprograms;

public class Collegue implements Comparable<Collegue> {
	int age;
	String name,relation;
	public Collegue(int age, String name, String relation) {
		super();
		this.age = age;
		this.name = name;
		this.relation = relation;
	}
	@Override
	public String toString() {
		return "Collegue [age=" + age + ", name=" + name + ", relation=" + relation + "]";
	}
	@Override
	public int compareTo(Collegue o) {
		return this.relation.compareTo(o.relation);
	}
}
