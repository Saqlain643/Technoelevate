package com.technoelevate.javabasics.assignment3;

public class MarriageMain {
	public static void main(String[] args) throws EligibilityException {
		Marriage marriage=new Marriage(21,18);
		marriage.eligibilityCheck();
	}
}
