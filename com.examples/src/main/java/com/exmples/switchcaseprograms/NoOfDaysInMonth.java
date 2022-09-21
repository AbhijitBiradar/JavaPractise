package com.exmples.switchcaseprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-print-number-of-days-in-a-month-using-switch-case

public class NoOfDaysInMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter month no:");
		int monthNo = scan.nextInt();

		switch (monthNo) {
		case 1:
			System.out.println("31 Days!");
			break;
		case 2:
			System.out.println("28 or 29 days");
			break;
		case 3:
			System.out.println("31 days");
			break;
		case 4:
			System.out.println("30 days");
			break;
		case 5:
			System.out.println("31 days");
			break;
		case 6:
			System.out.println("30 days");
			break;
		case 7:
			System.out.println("31 days");
			break;
		case 8:
			System.out.println("31 days");
			break;
		case 9:
			System.out.println("30 days");
			break;
		case 10:
			System.out.println("31 days");
			break;
		case 11:
			System.out.println("30 days");
			break;
		case 12:
			System.out.println("31 days");
			break;
		default:
			System.out.println("Invalid input");
		}
	}
}
