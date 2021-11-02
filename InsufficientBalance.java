package com.technoelevate.javabasics.exception;

public class InsufficientBalance extends RuntimeException {
	String msg;

	public InsufficientBalance(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
