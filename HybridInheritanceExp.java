package com.technoelevate.basicprograms.methodoverloading;

class HybridInheritanceExp extends Parent {
	void display() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		HybridInheritanceExp hybridInheritanceExp=new HybridInheritanceExp();
		hybridInheritanceExp.display();
	}
}
