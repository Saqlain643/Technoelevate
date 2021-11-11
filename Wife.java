package com.technoelevate.multithreadingprograms.synchronizeddemo;

public class Wife extends Thread {
	Account acc;

	public Wife(Account acc) {
		super();
		this.acc = acc;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("Wife thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
			acc.deposit(3000);
			acc.withdraw(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
		
	}

}
