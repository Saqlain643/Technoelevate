package com.technoelevate.sampleprograms.testprograms;

public class IndividualWordRev {
	public static void main(String[] args) {
		String s="Saqlain Mirza";
		String revStr="";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String word=str[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			revStr=revStr+revword+" ";
		}
		System.out.println(s);
		System.out.println(revStr);
	}
}
