package com.technoelevate.javabasics.exception;

public class DepositLimitExceedsException extends RuntimeException {
	String msg;

	public DepositLimitExceedsException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
}
