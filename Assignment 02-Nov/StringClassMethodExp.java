package com.technoelevate.javabasics.assignment3;

import java.util.Scanner;

public class StringClassMethodExp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		sc.close();
		System.out.println(capitalizeWord(str));
		
	}

	public static String capitalizeWord(String str){  
	    String words[]=str.split(" ");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  
	} 

}
