package com.technoelevate.javabasics.assignment3;

public class EligibilityException extends Throwable {
	String msg;

	public EligibilityException(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
