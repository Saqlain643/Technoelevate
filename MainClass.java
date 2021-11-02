package com.technoelevate.javabasics.exception;

public class MainClass {
	public static void main(String[] args) throws InsufficientBalance {
		BankAccount account=new BankAccount(5000);
		account.withdraw(500);
		account.deposit(100);
	}
}
