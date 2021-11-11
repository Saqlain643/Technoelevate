package com.technoelevate.multithreadingprograms.synchronizeddemo;

public class Husband extends Thread {
	Account acc;

	public Husband(Account acc) {
		super();
		this.acc = acc;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("Husband thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
			acc.deposit(3000);
			acc.withdraw(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
