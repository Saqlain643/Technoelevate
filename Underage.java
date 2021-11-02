package com.technoelevate.javabasics.assignment3;

public class Underage extends RuntimeException {
	String msg;

	public Underage(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
