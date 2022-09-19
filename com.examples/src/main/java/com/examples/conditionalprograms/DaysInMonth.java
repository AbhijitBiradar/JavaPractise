package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-enter-month-number-and-print-number-of-days-in-month

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter month number (1-12):");
		int month = scan.nextInt();

		if (month == 2) {
			System.out.println("Days will be 28/29 days");
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("Today Days: 31");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("Total Days : 30");
		} else {
			System.out.println("Invalid Month No.!");
		}
	}
}
