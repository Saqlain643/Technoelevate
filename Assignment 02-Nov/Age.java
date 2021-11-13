package com.technoelevate.javabasics.assignment3;

public class Age {
	int age;

	public Age(int age) {
		this.age = age;
	}

	public void elegibleAge() throws Underage {
		if(this.age>=18) {
			System.out.println("Elegible for voting");
		}else {
			throw new Underage("NotEleigleForVoting."+"After"+ (18-age)+"YearsYouWillBeEligibeForVoting");
		}
	}
}
