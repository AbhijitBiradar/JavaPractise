package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-calculate-the-total-marks-percentage-and-division-of-student

public class CalculateTotalMarksDivisionAndPercentage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter roll number:");
		int rollNo = scan.nextInt();

		System.out.println("Please enter name: ");
		String name = scan.next();

		System.out.println("Please enter physics marks:");
		int physicsMark = scan.nextInt();

		System.out.println("Please enter chemistry marks:");
		int checmistryMark = scan.nextInt();

		System.out.println("Please enter IT Marks:");
		int itMark = scan.nextInt();

		float percentage = (physicsMark + checmistryMark + itMark) / 3;

		if (percentage >= 60) {
			System.out.println("First Division!");
		} else if (percentage < 60 && percentage >= 48) {
			System.out.println("Second Division!");
		} else if (percentage < 48 && percentage >= 36) {
			System.out.println("Third Division!");
		} else {
			System.out.println("Fail!");
		}
	}
}
