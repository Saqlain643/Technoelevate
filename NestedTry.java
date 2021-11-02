package com.technoelevate.javabasics.assignment3;

public class NestedTry {   
	public static void main(String args[]){   
		try{    
		    try{    
		    	System.out.println("going to divide by 0");    
		    	int rem =39/0;    
		    }catch(ArithmeticException e)  {  
		    	System.out.println(e);  
		    }    
		    try{    
		    	int a[]=new int[5];    
		    	a[5]=4;    
		    }catch(ArrayIndexOutOfBoundsException e) {  
		       System.out.println(e);  
		    }    
		    System.out.println("statements");    
		}  
		catch(Exception e) {  
			System.out.println("handled the exception (outer catch)");  
		}    
		System.out.println("normal flow..");    
	}   
}  
