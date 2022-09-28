package com.examples.switchcaseprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-print-day-of-week-name-using-switch-case

public class DayOfWeekName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter week number:");
		int weekNumber = scan.nextInt();

		switch (weekNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid input! Please enter week no. between 1-7.");

		}
	}
}
