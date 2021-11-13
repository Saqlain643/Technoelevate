package com.technoelevate.javabasics.assignment1;

public class TestHierrarchical {
	public static void main(String[] args) {
		SonHierrarchical sonHierrarchical=new SonHierrarchical(10);
		DaughterHierrarchical daughterHierrarchical=new DaughterHierrarchical(60);
		System.out.println(sonHierrarchical.i);
		System.out.println(daughterHierrarchical.i);
	}
}
