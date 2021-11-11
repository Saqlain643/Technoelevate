package com.technoelevate.multithreadingprograms.synchronizeddemo;

public class Account {
	int balance;
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public synchronized void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance");
			return;
		}
		balance-=amount;
		System.out.println("Withdraw succesful");
		System.out.println("Balance="+balance);
	}
	
	public synchronized void deposit(int amount) {
		int temp=balance;
		temp+=amount;
		balance= temp;
		System.out.println("Deposited successfully");
		System.out.println("Available balance="+balance);
	}
	
	public void checkBalance() {
		System.out.println("Balance="+balance);
	}
}
