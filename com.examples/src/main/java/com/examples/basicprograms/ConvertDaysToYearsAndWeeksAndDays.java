package com.examples.basicprograms;

import java.util.Scanner;

// Reference
// https://techstudy.org/cLanguage/C-Program-to-convert-days-to-years-weeks-and-days

public class ConvertDaysToYearsAndWeeksAndDays {

	public static void main(String[] args) {
		int days, years, weeks;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter days: ");
		days=scan.nextInt();
		
		years = (days / 365);
	    weeks = (days % 365) / 7;
	    days  = days - ((years * 365) + (weeks * 7));
	    
	    System.out.println("Years : " + years);
	    System.out.println("Weeks : " + weeks);
	    System.out.println("Days : " + days);
	    
	    scan.close();

	}

}
