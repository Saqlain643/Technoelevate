package com.technoelevate.basicprograms.methodoverloading;

public class MultipleInheritanceExp {
	public static void main(String[] args) {
		CpuImpl cpuImpl=new CpuImpl();
		cpuImpl.click();
		cpuImpl.doubleClick();
		cpuImpl.rightClick();
	}
}
