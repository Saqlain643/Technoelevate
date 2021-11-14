package com.technoelevate.assignment2;

public class ThreadUsingLambda {
	public static void main(String[] args) {
		Runnable runnable=()->{
			System.out.println("My first thread");
			for(int i=0;i<5;i++) {
				System.out.println("1st run method");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable runnable1=()->{
			System.out.println("My second thread");
			for(int i=0;i<5;i++) {
				System.out.println("2nd run method");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread=new Thread(runnable);
		thread.start();
		
		Thread thread1=new Thread(runnable1);
		thread1.start();
	}
}
