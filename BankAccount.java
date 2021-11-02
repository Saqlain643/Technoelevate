package com.technoelevate.javabasics.exception;

public class BankAccount {
	double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalance {
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
			System.out.println("Successful withdraw");
			System.out.println("Balance="+ this.balance);
		}else {
			throw new InsufficientBalance("The amount exceeds the balance amount");
		}
	}
	public void deposit(double amount) throws DepositLimitExceedsException {
		if(amount<40000) {
			this.balance=this.balance+amount;
			System.out.println("Deposit Successful");
			System.out.println("Current Balance="+(balance));
		}else {
			throw new DepositLimitExceedsException("The amount exceeds the balance amount");
		}
	}
}
