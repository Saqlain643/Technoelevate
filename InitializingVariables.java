package com.technoelevate.javabasics.constructor;

public class InitializingVariables {
	int slno;
	String name;
	int marks;
	public InitializingVariables(int slno,String name,int marks) {
		this.slno=slno;
		this.name=name;
		this.marks=marks;
		System.out.println(slno + " " + name + " " + marks);
	}
	public static void main(String[] args) {
		InitializingVariables initializingVariables1=new InitializingVariables(01,"Saqlain",77);
		InitializingVariables initializingVariables2=new InitializingVariables(02,"Faizan",97);
		InitializingVariables initializingVariables3=new InitializingVariables(03,"Helen",87);
	}
}