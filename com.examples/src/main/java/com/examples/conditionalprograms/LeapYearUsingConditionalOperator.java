package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-check-leap-year-using-conditional-operator

public class LeapYearUsingConditionalOperator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a year!");
		int year=scan.nextInt();
		
		//((year%4==0 && year%100!=0) || year%400==0) ? System.out.println("It's Leap year!");: System.out.println("It's not a leap year");
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println("It's Leap year!");
		}else {
			System.out.println("It's not a leap year");
		}
	}
}
