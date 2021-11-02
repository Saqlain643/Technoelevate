package com.technoelevate.javabasics.assignment3;

public class Marriage {
	int ageOfMan,ageOfWoman;

	public Marriage(int ageOfMan,int ageOfWoman) {
		this.ageOfMan = ageOfMan;
		this.ageOfWoman = ageOfWoman;
		
	}
	
	public void eligibilityCheck() throws EligibilityException {
		if(ageOfMan>=21 && ageOfWoman>=18) {
			System.out.println("Elligible for marriage");
		}else {
			throw new EligibilityException("Not Elligibe For Marriage");
		}
	}	
}
