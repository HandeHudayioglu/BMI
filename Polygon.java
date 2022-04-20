package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		
		double n,s,A;
		double pi=3.14;
		
		Scanner scanner = new Scanner (System.in);
	    System.out.print("Enter the number of sides: ");
	    n = scanner.nextDouble();
	    
	    Scanner scanner2 = new Scanner (System.in);
	    System.out.print("Enter the side lenght: ");
	    s = scanner2.nextDouble();
	    
	    A=(n* Math.pow(s, 2)) /(4* Math.tan(Math.PI/n));
	    System.out.println("Area of polygon: " + A);	}
	}

	  
	    
	 


