package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;

public class IfElse {

//	public static void main(String[] args) {
//		int x,y;
//		x=2;
//		y=5;
//		if(x<y) {
//			System.out.println("x is smaller than y.");
//		}
//		else if(x==y)
//		{System.out.println("x is equal to y.");
//	}
//		else {
//			System.out.println("x is greater than y.");
//		}
//	       
//	}


	public static void main(String[] args) {
		double x;
		
		Scanner scanner = new Scanner (System.in);
	    System.out.print("Enter a number: ");
	    x = scanner.nextDouble();
	    
	    if(x>0) {	
	    	System.out.println("This number is a positive number.");
	    }
	    else if(x==0) {
	    	System.out.println("This number is a neutral number.");
	    }
	    else {
	    	System.out.println("This number is a negative number.");
	    }
	    	
	    	
	}
}