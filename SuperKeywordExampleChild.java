package com.technoelevate.javabasics.constructor;

public class SuperKeywordExampleChild extends SuperKeywordExample{
	void variableAccessing() {
		System.out.println(super.slno);
		System.out.println(super.name);
		System.out.println(super.marks);
	}
	public static void main(String[] args) {
		SuperKeywordExampleChild superMethodExampleChild=new SuperKeywordExampleChild();
		superMethodExampleChild.variableAccessing();
	}
}

