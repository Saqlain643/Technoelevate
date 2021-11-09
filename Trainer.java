package com.technoelevate.sampleprograms.testprograms;

public class Trainer implements Comparable<Trainer>{
	String name;
	String experience;
	int id;
	public Trainer(String name, String experience, int id) {
		super();
		this.name = name;
		this.experience = experience;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", experience=" + experience + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Trainer o) {
		return this.experience.compareTo(o.experience);
	}	
}
