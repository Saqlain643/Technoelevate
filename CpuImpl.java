package com.technoelevate.basicprograms.methodoverloading;

public class CpuImpl extends Computer implements Imouse{
	@Override
	public void click() {
		System.out.println("resource gets selected");
	}
	public void rightClick() {
		System.out.println("Show options");
	}
	public void doubleClick() {
		System.out.println("double click");
	}
}