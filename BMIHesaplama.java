package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;

public class BMIHesaplama {

	public static void main(String[] args) {
		
		double height,weight,bmi;
		String gender;
		
		Scanner scanner = new Scanner (System.in);
	    System.out.print("Kilonuzu giriniz:");
	    weight = scanner.nextDouble();
	    
	   
	    System.out.print("Boyunuzu giriniz: ");
	    height = scanner.nextDouble();
	    
	    
	    System.out.print("Cinsiyetinizi giriniz (K/E): ");
	    gender = scanner.next();
	    
	    bmi=(weight*10000)/ Math.pow(height, 2);
	    
	    if(gender.equals("K")) {
	    	if(bmi<19) {
	    		System.out.println("ZAYIF");
	    	}
	    	else if(bmi<24) {
	    		System.out.println("NORMAL");
	    	}
	    	else if(bmi<30) {
	    		System.out.println("ŞİŞMAN");
	    	}
	    	else {
	    		System.out.println("OBEZ");
	    	}
	    }
	    	else if(gender.equalsIgnoreCase("E")) {
	    		if(bmi<20) {
		    		System.out.println("ZAYIF");
		    	}
		    	else if(bmi<25) {
		    		System.out.println("NORMAL");
		    	}
		    	else if(bmi<30) {
		    		System.out.println("ŞİŞMAN");
		    	}
		    	else {
		    		System.out.println("OBEZ");
		    	}
	    	}
	    		
	    	}


	}


