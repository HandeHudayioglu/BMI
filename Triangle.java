package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		double A,B,C,a,b,c;
		
	     
	
		
		Scanner scanner = new Scanner (System.in);
	    System.out.print("Enter the first interior angle:");
	    A = scanner.nextDouble();
	    
	    Scanner scanner2 = new Scanner (System.in);
	    System.out.print("Enter the second interior angle:");
	    B = scanner2.nextDouble();
	    
	    Scanner scanner3 = new Scanner (System.in);
	    System.out.print("Enter the first lenght:");
	    a = scanner3.nextDouble();
	   
	    Scanner scanner4 = new Scanner (System.in);
	    System.out.print("Enter the second lenght:");
	    b = scanner4.nextDouble();
	    
	    C=180-(A+B);
	    double CRad= Math.toRadians(C);
	    double temp  =( Math.pow(a, 2)+ Math.pow(b, 2) ) -2*a*b*(Math.cos(C));
	    
	    System.out.println("Third interior angle: " +C) ;
	    c= Math.sqrt(temp);
	    System.out.println("Third lenght: " +c);
	    
		

}
}
