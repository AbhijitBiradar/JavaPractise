package com.examples.conditionalprograms;
import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-print-day-name-of-week

public class DayNameOfWeek {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter day in number (1 to 7)");
		int day = scan.nextInt();

		if (day == 1) {
			System.out.println("It's Moday");
		} else if (day == 2) {
			System.out.println("It's Tuesday");
		} else if (day == 3) {
			System.out.println("It's Wednesday");
		} else if (day == 4) {
			System.out.println("It's Thrusday");
		} else if (day == 5) {
			System.out.println("It's Friday");
		} else if (day == 6) {
			System.out.println("It's Saturday");
		} else if (day == 7) {
			System.out.println("It's Sunday");
		} else {
			System.out.println("Wrong day no!");
		}
	}
}
