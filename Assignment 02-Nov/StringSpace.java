package com.technoelevate.sampleprograms.testprograms;

public class StringSpace {
	public static void main(String[] args) {
		String s="saqlain mirza baig";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(i==0)
				c[i]=(char)((int)c[i]-32);
			else if(c[i]==' ')
				c[i+1]=(char)((int)c[i+1]-32);
		}
		String str=new String(c);
		System.out.println(str);
	}
}
