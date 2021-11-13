package com.technoelevate.javabasics.assignment2;

public class FactoryClass {
	Collegue collegue=null;
	
	public Collegue getCollegue(String name) {
		if(name.equalsIgnoreCase("Dhananjay")) {
			collegue=new Dhananjay();
		}else if(name.equalsIgnoreCase("Balla")) {
			collegue=new Balla();
		}else if(name.equalsIgnoreCase("Parag")) {
			collegue=new Parag();
		}else{
			collegue=new Nitish();
		}
		return collegue;
	}
}
